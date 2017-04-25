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
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list_name = (ListView) findViewById(R.id.listView);
        String[] values = new String[]{"Sachin Tendulkar",
                "ViratKohli",
                "Rohit Sharma",
                "Suresh Raina",
                "Gautam Gambhir",
                "Rahul Dravid"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.cricktername, R.id.textView, values);
        list_name.setAdapter(adapter);
        AdapterView list_view;
        list_name.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) list_name.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Position:" + itemPosition + "ListItem:" + itemValue, Toast.LENGTH_LONG)
                        .show();


            }
        });

    }
}


