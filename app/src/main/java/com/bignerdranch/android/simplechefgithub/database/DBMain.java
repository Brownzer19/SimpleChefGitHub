package com.bignerdranch.android.simplechefgithub.database;

import android.app.Activity;

import android.os.Bundle;

import com.bignerdranch.android.simplechefgithub.Helper.DatabaseHelper;
import com.bignerdranch.android.simplechefgithub.R;

/**
 * Created by Bradley on 4/19/17.
 */

public class DBMain extends Activity{

    // Database Helper
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_recipe);

        db = new DatabaseHelper(getApplicationContext());

        // Don't forget to close database connection
        db.closeDB();
    }
}
