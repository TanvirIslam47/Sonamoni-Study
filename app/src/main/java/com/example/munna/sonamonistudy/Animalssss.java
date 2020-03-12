package com.example.munna.sonamonistudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Animalssss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalssss);

    }
    public void beast(View view){
        Intent in = new Intent(Animalssss.this,Beast.class);
        startActivity(in);
    }

    public  void bird(View view){
        Intent in1 = new Intent(Animalssss.this,Bird.class);
        startActivity(in1);
    }
}
