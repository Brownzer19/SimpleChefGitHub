package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bignerdranch.android.simplechefgithub.SimpleDbSchema.SimpleTable;

/**
 * Created by Kauff on 4/7/2017.
 */
//defines the table 2

public class SimpleBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static String DATABASE_NAME = "recipe.db";

    public SimpleBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + SimpleTable.NAME +
                "(_id integer primary key autoincrement, " +
                SimpleTable.Cols.UUID + ", " +
                SimpleTable.Cols.QUANT + ", " +
                SimpleTable.Cols.MEAS + ", " +
                SimpleTable.Cols.INGR + ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
//////////////////////////////////