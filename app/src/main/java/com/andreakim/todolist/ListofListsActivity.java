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

import java.util.ArrayList;

public class ListofListsActivity extends AppCompatActivity {

    final String mFunnyMessage = "Wow! You are PERSISTENT!";
    //private Intent mIntentToMain;  <-- they can use "back button"
    private Intent mIntentToIndividualList;
    private ListView mListView;
    private ArrayAdapter<String> mArrayAdapter;
    private ArrayList<String> mArrayList;
    private AdapterView.OnClickListener mListener;
    private Toast mToast;

    private void removeList(int id) {
        if (mArrayList !=null) {
            mArrayList.remove(id);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_lists);

        Button btnNxt = (Button) findViewById(R.id.btn_add_list);
        Button deleteBtn = (Button) findViewById(R.id.btn_delete_list);

        //mIntentToMain = new Intent(ListofListsActivity.this, MainActivity.class);   <-- they can use "back button"
        mIntentToIndividualList = new Intent(ListofListsActivity.this, IndividualListActivity.class);


        mListView = (ListView) findViewById(R.id.lv_list_oflists);
        mArrayList = new ArrayList<>();
        mArrayList.add("Sample List");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Log.i("LISTS", "Click btn_main_add_list");
                startActivity(mIntentToIndividualList);
            }
        };

        btnNxt.setOnClickListener(listener);

        Intent mGetNameIntent = getIntent();
        String mName = mGetNameIntent.getStringExtra("name");
        if (mName != null) {
            mArrayList.add(mName);
        };
        mArrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_row_item, mArrayList);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "List TBD" , Toast.LENGTH_LONG).show();
            }
        });

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
