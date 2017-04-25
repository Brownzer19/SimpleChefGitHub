package com.bignerdranch.android.simplechefgithub;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Kauff on 3/8/2017.
 */

public class mainActivity extends AppCompatActivity {

    private Button mbuttonCook;
    private Button mbuttonCreate;
    private Button mbuttonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening_screen);
        addListenerOnButton();
}

    public void addListenerOnButton() {

        final Context context = this;

        mbuttonCook = (Button) findViewById(R.id.button2);
        mbuttonCook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Main2Activity.class);
                startActivity(intent);
            }
        });

        mbuttonCreate = (Button) findViewById(R.id.button3);
        mbuttonCreate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SimpleChef.class);
                startActivity(intent);
            }
        });

        mbuttonSettings = (Button) findViewById(R.id.button4);
        mbuttonSettings.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}

