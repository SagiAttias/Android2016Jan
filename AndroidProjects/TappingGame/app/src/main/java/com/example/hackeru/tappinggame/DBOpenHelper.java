package com.example.hackeru.tappinggame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hackeru on 03/08/2016.
 */
public class DBOpenHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "kevinDB.db"; // must have .db!!!!
    private static final int DB_VERSION = 1;

    public static final String TABLE_SCORES = "scores";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SCORE = "score";

    private static final String CREATE_TABLE_SCORES = "CREATE TABLE " + TABLE_SCORES + " (" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_NAME + " TEXT, " +
            COLUMN_SCORE + " INTEGER)";

    public DBOpenHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_SCORES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
