package com.bignerdranch.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class NewIntent extends AppCompatActivity {
    int position;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_intent);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=(ListView)findViewById(R.id.listview);
        String[] values = new String[] {"Kuala Terengganu", "Gong Badak", "SyahBandar", "UMT"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent myIntent = new Intent(view.getContext(),expandablelist.class);
                    startActivityForResult(myIntent,0);
                }
                if (position==1){
                    Intent myIntent = new Intent(view.getContext(),expandablelist.class);
                    startActivityForResult(myIntent,1);
                }
                if (position==2){
                    Intent myIntent = new Intent(view.getContext(),expandablelist.class);
                    startActivityForResult(myIntent,2);
                }
                if (position==3){
                    Intent myIntent = new Intent(view.getContext(),expandablelist.class);
                    startActivityForResult(myIntent,3);
                }
            }
        });


    }
}
