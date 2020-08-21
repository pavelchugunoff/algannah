package com.chugunoff.algannah;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.chugunoff.algannah.Database.DBHelper;

public class MainActivity extends AppCompatActivity {

    DBHelper dbHelper;
    SQLiteDatabase registeredUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dbHelper = new DBHelper(this, "registeredUsers", 1);
        registeredUsers = dbHelper.getWritableDatabase();
        Cursor cursor = registeredUsers.query("users",null,null,null,null,null,null);
        String password;
        String login;

        if(cursor.moveToFirst()){
            int loginIndex = cursor.getColumnIndex("login");
            int passwordindex = cursor.getColumnIndex("password");
            password = cursor.getString(passwordindex);
            login = cursor.getString(loginIndex);


        }else{
            setContentView(R.layout.activity_main);
        }
    }
}