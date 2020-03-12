package com.example.munna.sonamonistudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Animals extends AppCompatActivity {

    ViewPager viewPager;
    int images[] = {R.drawable.lion, R.drawable.tiger,R.drawable.doel,R.drawable.beat,R.drawable.hati};
    MyCustomPagerAdapter myCustomPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        myCustomPagerAdapter = new MyCustomPagerAdapter(Animals.this,images);
        viewPager.setAdapter(myCustomPagerAdapter);

    }



}
