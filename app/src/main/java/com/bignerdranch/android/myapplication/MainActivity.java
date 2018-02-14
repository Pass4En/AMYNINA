package com.bignerdranch.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button start;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button)findViewById(R.id.start);
        text = (TextView)findViewById(R.id.old);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewIntent();

            }
        });

    }
    public  void openNewIntent(){
        Intent intent = new Intent (this, NewIntent.class);
        startActivity(intent);
    }

}
