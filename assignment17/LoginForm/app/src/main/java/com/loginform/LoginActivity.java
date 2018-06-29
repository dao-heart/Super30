package com.loginform;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button2 = (Button) findViewById(R.id.button2);
        SharedPreferences sharedPreferences = getSharedPreferences("com.loginform", Context.MODE_PRIVATE);
        final String username = sharedPreferences.getString("username", "Not found!");
        final String password = sharedPreferences.getString("password", "Not found!");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                if (editText.getText().toString().compareTo(username)!=0) {
                    Toast.makeText(getApplicationContext(), "Invalid Email", Toast.LENGTH_SHORT).show();
                } else if (editText2.getText().toString().compareTo(password)!=0) {
                    Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(LoginActivity.this, WelcomeActivity.class);
                    startActivity(intent3);
                }
            }
        });
    }
}
