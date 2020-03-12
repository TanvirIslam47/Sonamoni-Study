package com.example.munna.sonamonistudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class BanglaSahitto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_sahitto);



    }

    public void sorbonno(View view){
        Intent in = new Intent(BanglaSahitto.this,SorbonnoBangla.class);
        startActivity(in);
    }
    public void bengonborno(View view){
        Intent in1 = new Intent(BanglaSahitto.this,Benjonbonno.class);
        startActivity(in1);
    }
    public void capital_letter(View view){
        Intent in2 = new Intent(BanglaSahitto.this,CapitalLetter.class);
        startActivity(in2);
    }
    public void small_letter(View view){
        Intent in3 = new Intent(BanglaSahitto.this,SmallLetter.class);
        startActivity(in3);
    }

    public void test(View view){
        Intent in4 = new Intent(BanglaSahitto.this,Test.class);
        startActivity(in4);
    }




}
