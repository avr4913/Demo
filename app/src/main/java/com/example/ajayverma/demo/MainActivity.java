package com.example.ajayverma.demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView i;
    Button b_ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = (ImageView) findViewById(R.id.ImageView);
        b_ok = (Button) findViewById(R.id.Button);


        i.setOnClickListener(this);
        b_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (view.getId() == R.id.ImageView) {
            i = setVisible(View.GONE);

            b_ok = setVisible(View.INVISIBLE);
        } else {
            b_ok = setVisible(View.GONE);
            i = setVisible(View.INVISIBLE);
        }
    }
}