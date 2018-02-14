package com.bignerdranch.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class expandablelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandablelist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
