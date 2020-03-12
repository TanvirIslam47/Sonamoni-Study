package com.example.munna.sonamonistudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.net.Inet4Address;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



    }

    public void sahitto(View view){
        Intent in = new Intent(Main2Activity.this,BanglaSahitto.class);
        startActivity(in);
    }

    public  void color(View view){
        Intent in1 = new Intent(Main2Activity.this,Color.class);
        startActivity(in1);
    }
    public  void animal(View view){
        Intent in2 = new Intent(Main2Activity.this,Animalssss.class);
        startActivity(in2);
     }
     public void folowers(View view){
         Intent in3 = new Intent(Main2Activity.this,Flowers.class);
         startActivity(in3);
      }
    public void fruits(View view){
        Intent in4 = new Intent(Main2Activity.this,Fruits.class);
        startActivity(in4);
    }
    public void daymonth(View view){
        Intent in5 = new Intent(Main2Activity.this,daymonth.class);
        startActivity(in5);
    }


}
