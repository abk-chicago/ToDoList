package com.andreakim.todolist;

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

    private Intent mIntentToMain;
    private Intent mIntentToIndividualList;

    private ListView mListView;
    private ArrayAdapter<ListofListsActivity> mArrayAdapter;
    private ArrayList<ListofListsActivity> mList;
    private AdapterView.OnClickListener mListener;

    private Toast mToast;
    String mFunnyMessage = "Wow! You are PERSISTENT!";

    //todo: model code
    private void addListofListsActivity(String name, String desc) {
        if (mList != null && mArrayAdapter != null) {
            ListofListsActivity toDoList = new ListofListsActivity();
            mList.add(toDoList);
            mArrayAdapter.notifyDataSetChanged();

        } else {
            mList = new ArrayList<ListofListsActivity>();
            ListofListsActivity toDoList = new ListofListsActivity();
            mList.add(toDoList);
            mArrayAdapter.notifyDataSetChanged();
        }

    }

    private void removeList(int id) {
        if (mList !=null) {
            mList.remove(id);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_lists);

        Button btnNxt = (Button) findViewById(R.id.btn_add_list);
        mIntentToMain = new Intent(ListofListsActivity.this, MainActivity.class);
        mIntentToIndividualList = new Intent(ListofListsActivity.this, IndividualListActivity.class);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Log.i("LISTS", "Click btn_main_add_list");
                startActivity(mIntentToIndividualList);
            }

    };

  btnNxt.setOnClickListener(listener);











        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), mFunnyMessage, Toast.LENGTH_LONG).show();
            }
        });
    }

    /**
     * Created by andreakim on 6/17/16.
     */
    public static class Item {


    }
}
