package com.bignerdranch.android.simplechefgithub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RadioButton;

/**
 * Created by Bradley on 3/26/17.
 */

//android:background="@color/colorAccent" from settings home button
/*
    <RadioButton
        android:id="@+id/sound"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_margin="5dp"
        android:checked="true"
        android:text="Sound"/>

    <RadioButton
        android:id="@+id/font"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_margin="5dp"
        android:checked="false"
        android:text="Larger Font"/>
     */

public class SettingsActivity extends AppCompatActivity {

    private ImageButton mhomeButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.settings);

        //this.setOnCheckedChangeListener(findViewById(R.id.red_button));
        //this.setOnCheckedChangeListener(findViewById(R.id.green_button));
        //this.setOnCheckedChangeListener(findViewById(R.id.blue_button));
    }

    public void setOnCheckedChangeListener(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.green_button:
                if (checked) {
                    Utils.changeToTheme(this, Utils.THEME_GREEN);
                };
                break;
            case R.id.blue_button:
                if (checked) {
                    Utils.changeToTheme(this, Utils.THEME_BLUE);

                };
                break;
            case R.id.red_button:
                if (checked) {
                    Utils.changeToTheme(this, Utils.THEME_APP);
                };
                break;
        }
    }

    /*
    private RadioButton

    OnCreate(Bundle Savedinstancestate) {
        Super.onCreate(Savedinstancestate)
        Font_radiobutton = get(Font_radiobutton)
    }
    sound activity (sound radio button status) {
        If (sound_radiobutton == null || !sound_radiobutton == checked) {
            //Sound is muted
        } else {
            //Sound is unmuted
        }}
    sound activity (sound radio button status) {
        If (font_radiobutton.Savedinstancestate == clicked && font_radiobutton == unclicked) {
            Font decreased
            Font_radiobutton.Savedinstancestate = font_radiobutton
        } elseif (font_radiobutton.Savedinstancestate == unclicked && font_radiobutton == clicked) {
            font increased
            font_radiobutton.Savedinstancestate = font_radiobutton
        } else {
            font left the same
        }}

    sound_radiobutton.OnClickListener (new View.OnClickListener()) {
        OnClick (sound_radiobutton == clicked) {
            Savedinstancestate(!sound_radioButton)
            Start activity to change sound (sound_radio button, status)
        }}
    font_radiobutton.OnClickListener (new View.OnClickListener()) {
        OnClick (font_radiobutton == clicked) {
            Start activity to change sound (sound_radio button, status)
        }}

    */

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final Context context = this;
        View v = inflater.inflate(R.layout.multiplied_recipe, container, false);

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