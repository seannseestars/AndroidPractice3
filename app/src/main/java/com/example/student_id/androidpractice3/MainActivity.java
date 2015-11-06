package com.example.student_id.androidpractice3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.app.AlertDialog;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickDiscoveryMainPage(View view) {

        //SetcontentView only changes the layout. It does not implement the java code from that particualar page
        Log.d("MainActivity", "Test if this onClickDiscoveryMainPage is being run");
        //setContentView(R.layout.discovery_main_page);

        Intent discoveryHomeMainIntent = new Intent(this, DiscoveryHomeMain.class);
        startActivity(discoveryHomeMainIntent);

    }


    //public void onClickHappinessGuaranteeButton(View view) {

//        Context context = this;

//        AlertDialog.Builder happinessGuaranteeAlertDialogue = new AlertDialog.Builder(context);
//


//                happinessGuaranteeAlertDialogue.setIcon(R.drawable.mascot_happy);
//                happinessGuaranteeAlertDialogue.setTitle(R.string.happiness_guarantee_title);
//                happinessGuaranteeAlertDialogue.setMessage(R.string.happiness_guarantee_message);

//                happinessGuaranteeAlertDialogue.setView(R.layout.happiness_guarantee_dialog_box);

//                AlertDialog alertDialog = happinessGuaranteeAlertDialogue.create();
//
//                alertDialog.show();

        //setContentView(R.layout.happiness_guarantee_dialog_box);


    //}

    //public void onClickDialogBoxCoolBtn(View view) {

      //  setContentView(R.layout.discovery_main_page);

 //   }
}
