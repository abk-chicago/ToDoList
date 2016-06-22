package com.andreakim.todolist;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListofListsActivity extends AppCompatActivity {

    final String mFunnyMessage = "Wow! You are PERSISTENT!";

    private Intent mIntentToIndividualList;

    private ListView mListView;
    private ArrayAdapter<String> mArrayAdapter;
    ArrayList<String> mArrayList = new ArrayList<>();
    private AdapterView.OnClickListener mListener;



    private Toast mToast;
    String[][] allArrays = new String[][] { };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_lists);

        Button btnNxt = (Button) findViewById(R.id.btn_add_list);

        mIntentToIndividualList = new Intent(ListofListsActivity.this, IndividualListActivity.class);


        mListView = (ListView) findViewById(R.id.lv_list_oflists);
//
//        private void addList (String name, String desc){
//        if (mArrayList != null) {
//            ListItem stuff = new ListItem(name, desc);
//          //  mArrayList.add(stuff);
//        } else {
//        mArrayAdapter = new ArrayAdapter<String>;
//        };


//        Intent mGetNameIntent = getIntent();
//        String mName = mGetNameIntent.getStringExtra("name");
//        if (mName != null) {
//            //add
//        };
//        mArrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_row_item, mArrayList);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Log.i("MAIN", "Click btn_take_to_list");
                startActivity(mIntentToIndividualList);
            }
        };
        btnNxt.setOnClickListener(listener);

        
        mListView.setAdapter(mArrayAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), mFunnyMessage, Toast.LENGTH_LONG).show();
            }
        });
    }
}
/**
 * Created by andreakim on 6/17/16.
 */
