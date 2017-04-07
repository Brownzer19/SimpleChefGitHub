package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


    private Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_cookbook);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        mbutton = (Button) findViewById(R.id.soup);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Edit_recipeActivity.class);
                startActivity(intent);
            }
        });
    }
}
