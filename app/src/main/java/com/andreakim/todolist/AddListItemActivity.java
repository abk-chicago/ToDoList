package com.andreakim.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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

public class AddListItemActivity extends AppCompatActivity {

    private Intent mIntentToMain;
    private Intent mIntentToIndividualList;
    private Intent mIntentToLists;

    private ArrayList<String> mAddItem = new ArrayList<>();
    private ArrayAdapter <String> mAddItemAdapter;

    private String mItem;

    private ListView mListItemView;
    private AdapterView.OnClickListener mListener;


    private Toast mToast;
    final String mFunnyMessage = "You're having fun, aren't you?";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_item);

        Button btnNxt = (Button) findViewById(R.id.btn_add_list);
        Button btnNxt2 = (Button) findViewById(R. id.btn_delete_list);

        mIntentToMain = new Intent(AddListItemActivity.this, MainActivity.class);
        mIntentToIndividualList = new Intent(AddListItemActivity.this, IndividualListActivity.class);
        mIntentToLists = new Intent(AddListItemActivity.this, ListofListsActivity.class);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("LISTS", "Click btn_add_item");
                startActivity(mAddItem);
            }

        };

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("LISTS", "Click btn_delete_item");
                startActivity(removeItem(ArrayList mDeleteItem));
            }

        };

        btnNxt.setOnClickListener(listener);
        btnNxt2.setOnClickListener(listen);


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


    private void removeItem(int id) {
        if (mItem != null) {
            mItem.remove(id);
        }
    }

}
