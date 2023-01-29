package com.asgar72.imp.AdapterDemoEight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.asgar72.imp.R;

import java.util.ArrayList;

public class ActivityEight extends AppCompatActivity {

    ListView listview_searchone;
    SearchView searchView_one;


    String[] names={"Asgar","Hasan","Shajar","Aman","Taqi","Naqi","Shabab","Meezan","Fahmi","Shuja","Akbar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        listview_searchone = findViewById(R.id.listview_searchone);
        searchView_one = findViewById(R.id.searchView_one);



        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,names);
        listview_searchone.setAdapter(arrayAdapter);

    }
}