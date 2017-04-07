package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Edit_recipeActivity extends AppCompatActivity {

    private ImageButton mbuttonHome;
    private Button mHalfButton;
    private Button mDoubledButton;
    private Button mTripledButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_recipe);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        mbuttonHome = (ImageButton) findViewById(R.id.multiplied_home_button);
        mbuttonHome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, mainActivity.class);
                startActivity(intent);
            }
        });

        mHalfButton = (Button) findViewById(R.id.button_half);
        mHalfButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HalvedFragment.class);
                startActivity(intent);
            }
        });

        mDoubledButton = (Button) findViewById(R.id.button_doubled);
        mDoubledButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HalvedFragment.class);
                startActivity(intent);
            }
        });

        mTripledButton = (Button) findViewById(R.id.button_tripled);
        mTripledButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TripledFragment.class);
                startActivity(intent);
            }
        });
    }
}
