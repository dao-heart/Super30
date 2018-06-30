package com.login_register;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button2 = (Button) findViewById(R.id.button2);
        final SharedPreferences sharedPreferences = getSharedPreferences("com.login_register", Context.MODE_PRIVATE);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
                if (!checkUsername(editText.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Invalid Email", Toast.LENGTH_SHORT).show();
                } else if (!checkPassword(editText2.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                    if(checkBox2.isChecked()) {
                        sharedPreferences.edit().putString("username", (editText.getText()).toString()).apply();
                        sharedPreferences.edit().putString("password", (editText2.getText()).toString()).apply();
                        sharedPreferences.edit().putBoolean("isLogin", (checkBox2.isChecked())).apply();
                    }
                    Intent intent3 = new Intent(LoginActivity.this, Welcome.class);
                    intent3.putExtra("username", editText.getText().toString());
                    startActivity(intent3);
                }
            }
        });
    }
    Boolean checkUsername(String username) {
        SQLiteDatabase db = this.openOrCreateDatabase("userDB", MODE_PRIVATE, null);
        Cursor c = db.rawQuery("SELECT * FROM user WHERE email='"+username+"'", null);
        c.moveToFirst();
        if(c!=null) {
            return true;
        }
        else {
            return false;
        }
    }
    Boolean checkPassword(String password) {
        SQLiteDatabase db = this.openOrCreateDatabase("userDB", MODE_PRIVATE, null);
        Cursor c = db.rawQuery("SELECT * FROM user WHERE email='"+password+"'", null);
        c.moveToFirst();
        if(c!=null) {
            return true;
        }
        else {
            return false;
        }
    }
}

