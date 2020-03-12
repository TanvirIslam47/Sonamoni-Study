package com.example.munna.sonamonistudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class daymonth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daymonth);
    }
    public void din(View view){
        Intent in1 = new Intent(daymonth.this,Day.class);
        startActivity(in1);
    }
    public void mash(View view){
        Intent in2 = new Intent(daymonth.this,Month.class);
        startActivity(in2);
    }
    public void rritu(View view){
        Intent in3 = new Intent(daymonth.this,Season.class);
        startActivity(in3);
    }
}
