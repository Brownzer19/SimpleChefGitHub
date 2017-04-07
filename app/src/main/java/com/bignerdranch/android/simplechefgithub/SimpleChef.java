package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Spinner;

public class SimpleChef extends AppCompatActivity {

    private Spinner mSpinner;
    private ImageButton mbuttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_fragment);
        addListenerOnButton();
    }

    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.recipe_fragment, container, false);
        final Context context = this;

        return v;
    }

    ;

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

        
    }

/**
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.recipe_fragment, container, false);


        // create quantity spinner spinner
        Spinner quantitySpinner = (Spinner) findViewById(R.id.quantity_spinner);
        ArrayAdapter<CharSequence> quantityAdapter = ArrayAdapter.createFromResource(this,
                R.array.quantity_array, android.R.layout.simple_spinner_item);
        quantityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quantitySpinner.setAdapter(quantityAdapter);

        Spinner measurementSpinner = (Spinner) findViewById(R.id.measurement_spinner);
        ArrayAdapter<CharSequence> measurementAdapter = ArrayAdapter.createFromResource(this, R.array.measurement_array,
                android.R.layout.simple_spinner_item);
        measurementAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        measurementSpinner.setAdapter(measurementAdapter);

        return v;
    }
*/
}
