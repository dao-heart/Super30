package com.login_register;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent intent  = getIntent();
        final String username = intent.getStringExtra("username");
        Log.d("USERNAME", username);
        TextView name = (TextView) findViewById(R.id.textView3);
        TextView age = (TextView) findViewById(R.id.textView4);
        TextView email = (TextView) findViewById(R.id.textView5);
        SQLiteDatabase db = this.openOrCreateDatabase("userDB", MODE_PRIVATE, null);
        Cursor c = db.rawQuery("SELECT name, age, email FROM user WHERE email='"+username+"'", null);
        c.moveToFirst();
        int nameIndex = c.getColumnIndex("name");
        int ageIndex = c.getColumnIndex("age");
        int emailIndex = c.getColumnIndex("email");
        name.setText(c.getString(nameIndex));
        age.setText("AGE: "+(c.getInt(ageIndex))+"");
        email.setText("EMAIL: "+c.getString(emailIndex));
    }
}
