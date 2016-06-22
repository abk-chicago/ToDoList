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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddListItemActivity extends AppCompatActivity {

    final String mFunnyMessage = "You're having fun, aren't you?";
    private Intent mIntentToMain;
    private Intent mIntentToIndividualList;
    private Intent mIntentToLists;
    private ArrayList<ListItem> mAddItem = new ArrayList<>();
    private ArrayAdapter<ListItem> mAddItemAdapter;
    private String mItem;
    private ListView mListItemView;
    private AdapterView.OnClickListener mListener;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_item);

        Button btnNxt = (Button) findViewById(R.id.btn_add_list);

        mIntentToMain = new Intent(AddListItemActivity.this, MainActivity.class);
        mIntentToIndividualList = new Intent(AddListItemActivity.this, IndividualListActivity.class);
        mIntentToLists = new Intent(AddListItemActivity.this, ListofListsActivity.class);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN", "Click btn_take_to_list");
            }
        };


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), mFunnyMessage, Toast.LENGTH_LONG).show();
            }
        });


        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("LISTS", "Click btn_add_item");
            }
        };

//    private void addListItem(String name, String desc) {
//        if (mAddItem != null) {
//            ListItem stuff = new ListItem(name, desc);
//            mAddItem.add(stuff);
//        } else {
//            ArrayList mAddItem = new ArrayList();
//            ListItem stuff = new ListItem(name, desc);
//            mAddItem.add(stuff);
//        };
//    };
//    private void removeListItem(String name, String desc) {
//        if (mAddItem != null) {
//            mAddItem.remove(id);
//        }
//    };

        View.OnLongClickListener listen = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.i("LISTS", "Click delete");
                mAddItem.clear();
                return true;
            }
        };
    }
}