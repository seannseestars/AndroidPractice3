package com.example.student_id.androidpractice3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Student-ID on 2/11/2015.
 */
public class DiscoveryHomeMain extends MainActivity {

    Button button;

    Context context = this;

    //TextView textViewCustom;
    Typeface myCustomFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.discovery_main_page);


        //textViewCustom = (TextView) findViewById(R.id.happinessGuaranteeButton);
        myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/VarelaRound-Regular.otf");
        Log.d("DiscoveryHomeMain", "Show if font is being set");


        button = (Button) findViewById(R.id.happinessGuaranteeButton);
        button.setTypeface(myCustomFont);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("DiscoveryHomeMain", "Test if method is running");
                AlertDialog.Builder happinessGuaranteeAlertDialogue = new AlertDialog.Builder(context);

                happinessGuaranteeAlertDialogue.setIcon(R.drawable.mascot_happy)
                        .setTitle(R.string.happiness_guarantee_title)
                        .setMessage(R.string.happiness_guarantee_message);

                AlertDialog alertDialog = happinessGuaranteeAlertDialogue.create();

                alertDialog.show();
                //setContentView(R.layout.happiness_guarantee_dialog_box);
            }

        });
    }

}
