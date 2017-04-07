package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Bradley on 3/26/17.
 */



public class MultipliedRecipeActivity extends AppCompatActivity {


    public Button mfacebookButton;
    public ImageButton mhomeButton;
    private Spinner mitems;
    private TextView minstruction;
    private Spinner mmeasurements;
    private TextView mtitle;
    private TextView mquantity;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final Context context = this;
        View v = inflater.inflate(R.layout.multiplied_recipe, container, false);

        //mfacebookButton.setOnClickListener(new View.OnClickListener()) {
        //    @Override
        //            OnClick (View v) {
        //        //Open Facebook
        //    }}

        mhomeButton = (ImageButton) v.findViewById(R.id.multiplied_home_button);
        mhomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, mainActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
