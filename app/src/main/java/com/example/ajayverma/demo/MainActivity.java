package com.example.ajayverma.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText itemName;
    private ListView itemListView;
    private Button clickButton;
    private ArrayAdapter <String> itemListAdapter;
    private ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dataentry);
        itemName = (EditText) findViewById(R.id.EnterItem_name);
        clickButton = (Button) findViewById(R.id.Click);
        itemListView = (ListView) findViewById(R.id.list_item);

        itemList = new ArrayList<String>();

        itemListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList);
        itemListView.setAdapter(itemListAdapter);

        clickButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                itemList.add(itemName.getText().toString());
                itemName.setText("");
                itemListAdapter.notifyDataSetChanged();
            }
        });

        itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG)
                        .show();
            }
        });


    }

}