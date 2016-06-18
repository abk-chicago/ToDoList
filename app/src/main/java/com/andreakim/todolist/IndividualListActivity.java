package com.andreakim.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IndividualListActivity extends AppCompatActivity {


    private Intent mIntentToGoMain;
    private Intent mIntentToGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_list);

        Button btnMain = (Button) findViewById(R.id.btn_goto_main);
        Button btnLists = (Button) findViewById(R.id.btn_goto_all_lists);
        mIntentToGoMain = new Intent(IndividualListActivity.this, MainActivity.class);
        mIntentToGoBack = new Intent(IndividualListActivity.this, ListofListsActivity.class);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Log.i("LISTS", "Click btn_goto_Lists");
                startActivity(mIntentToGoMain);
            }
        };

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Log.i("LISTS", "Click btn_goto_Lists");
                startActivity(mIntentToGoBack);
            }
        };
        btnMain.setOnClickListener(listener);
        btnLists.setOnClickListener(listen);




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

}
