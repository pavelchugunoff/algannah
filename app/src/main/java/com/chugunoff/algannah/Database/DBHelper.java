package com.chugunoff.algannah.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context, String name,int version) {
        // конструктор суперкласса
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("[INFO]", "--- onCreate database ---");
        // создаем таблицу с полями
        db.execSQL("CREATE TABLE `users` ( `login` text NOT NULL , `password` text NOT NULL );");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

