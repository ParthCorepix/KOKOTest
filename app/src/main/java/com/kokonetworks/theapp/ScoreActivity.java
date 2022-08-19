package com.kokonetworks.theapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {
    private final TextView[] circles = new TextView[10];
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        circles[0] = (TextView) findViewById(R.id.one);
        circles[1] = (TextView) findViewById(R.id.two);
        circles[2] = (TextView) findViewById(R.id.three);
        circles[3] = (TextView) findViewById(R.id.four);
        circles[4] = (TextView) findViewById(R.id.five);
        circles[5] = (TextView) findViewById(R.id.six);
        circles[6] = (TextView) findViewById(R.id.seven);
        circles[7] = (TextView) findViewById(R.id.eight);
        circles[8] = (TextView) findViewById(R.id.nine);
        circles[9] = (TextView) findViewById(R.id.ten);

    }
}
