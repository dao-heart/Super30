package com.login_register;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sharedPreferences = this.getSharedPreferences("com.loginform", Context.MODE_PRIVATE);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText3 = (EditText) findViewById(R.id.editText3);
                EditText editText4 = (EditText) findViewById(R.id.editText4);
                EditText editText5 = (EditText) findViewById(R.id.editText5);
                EditText editText6 = (EditText) findViewById(R.id.editText6);
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
                String textUsername = editText3.getText().toString();
                String textPassword = editText4.getText().toString();
                String textName = editText5.getText().toString();
                Integer textAge = Integer.parseInt(editText6.getText().toString());
                Boolean isLogin = checkBox.isChecked();

                if (editText3.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter Email", Toast.LENGTH_SHORT).show();
                } else if (editText4.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_SHORT).show();
                } else {
                    if(checkBox.isChecked()) {
                        sharedPreferences.edit().putString("username", textUsername).apply();
                        sharedPreferences.edit().putString("password", textPassword).apply();
                        sharedPreferences.edit().putString("fullname", textName).apply();
                        sharedPreferences.edit().putInt("age", textAge).apply();
                        sharedPreferences.edit().putBoolean("isLogin", isLogin).apply();
                        sql(textUsername, textPassword, textName, textAge);
                        Intent intent3 = new Intent(MainActivity.this, Welcome.class);
                        intent3.putExtra("username", textUsername);
                        startActivity(intent3);
                    }
                    else {
                        sql(textUsername, textPassword, textName, textAge);
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Boolean isLogin = sharedPreferences.getBoolean("isLogin", false);
                if(isLogin==true) {
                    final String username = sharedPreferences.getString("username", "Not Found!");
                    Intent welcome = new Intent(MainActivity.this, Welcome.class);
                    welcome.putExtra("username", username);
                    startActivity(welcome);
                } else {
                    Intent intent2 = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent2);
                }
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
            }
        });
    }
    void sql(String username, String password, String name, Integer age) {
        try  {
            SharedPreferences sharedPreferences = getSharedPreferences("com.login_register", Context.MODE_PRIVATE);
            SQLiteDatabase db = this.openOrCreateDatabase("userDB", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS  user (name VARCHAR, age INT(3), email VARCHAR, password VARCHAR)");
            db.execSQL("INSERT INTO user values('"+name+"', "+age+", '"+username+"', '"+password+"')");
            Cursor c = db.rawQuery("SELECT * FROM user", null);
            int nameIndex = c.getColumnIndex("name");
            int ageIndex = c.getColumnIndex("age");
            int emailIndex = c.getColumnIndex("email");
            int passwordIndex = c.getColumnIndex("password");
            c.moveToFirst();
            while(c!=null) {
                Log.d("NAME", c.getString(nameIndex));
                Log.d("AGE", c.getString(ageIndex));
                Log.d("EMAIL", c.getString(emailIndex));
                Log.d("PASSWORD", c.getString(passwordIndex));
                c.moveToNext();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
