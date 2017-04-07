package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Bradley on 3/26/17.
 */

public class MultipliedReturnActivity extends AppCompatActivity {

    private Button myesButton;
    private Button mnoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplied_return_screen);
        addListenerOnButton();
    }

    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.multiplied_return_screen, container, false);
        final Context context = this;

        return v;
    };

    public void addListenerOnButton() {

        final Context context = this;

        myesButton = (Button) findViewById(R.id.yes_return);
        myesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, mainActivity.class);
                startActivity(intent);
            }
        });

        mnoButton = (Button) findViewById(R.id.no_stay);
        mnoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
