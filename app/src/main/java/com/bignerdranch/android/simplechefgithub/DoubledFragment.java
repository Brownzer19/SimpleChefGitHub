package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Bradley on 3/30/17.
 */

public class DoubledFragment extends AppCompatActivity {

    private double mquantity1;
    private double mquantity2;
    private static final String mtitle = ": Doubled";
    private ImageButton mHomeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplied_recipe);
        addListenerOnButton();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.multiplied_recipe, container, false);

//        mtitle = getString(recipe.get(mtitle) + getString(R.string.doubled));
//        mquantity1 = recipe.get(mquantity1) * 2d;
//        mquantity2 = recipe.get(mquantity2) * 2d;

        mquantity1 = 2d;
        mquantity2 = 2d;


        return v;
    };

    public void addListenerOnButton() {

        final Context context = this;

        mHomeButton = (ImageButton) findViewById(R.id.multiplied_home_button);
        mHomeButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MultipliedReturnActivity.class);
                startActivity(intent);
            }
        });


    }
}
