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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class IndividualListActivity extends AppCompatActivity {


    private Intent mIntentToGoMain;
    private Intent mIntentToGoBack;
    private EditText mTxtName;
    private Intent mIntent;
    private ListView lv;

    private Toast mToast;
    final String mFunnyMessage = "I STILL don't do anything. Did you think I would change my mind?";


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

       // mIntent = getIntent();
       // mTxtName = (EditText) findViewById(R.id.et_name);

        final EditText txt = (EditText)findViewById(R.id.et_name);
      //  final String name = txt.getText();


            View.OnClickListener oclSubmit = new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    Log.i("LISTS", "Click submit");
                    Intent mInt = new Intent(IndividualListActivity.this, ListofListsActivity.class);
                    assert txt != null;
                    mInt.putExtra("Name", txt.getText());
                    startActivity(mInt);
                    }
                };
        final Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(oclSubmit);

        TextView nameText = (TextView) findViewById(R.id.tv_list1a);
        nameText.setText(txt.getText());

        View.OnLongClickListener longListen = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick (View v) {
                Log.i("LISTS", "Click delete");
                // do something on long click
                return true;
            }
        };



            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                Toast.makeText(getApplicationContext(), mFunnyMessage, Toast.LENGTH_LONG).show();
                }
    });
}
}