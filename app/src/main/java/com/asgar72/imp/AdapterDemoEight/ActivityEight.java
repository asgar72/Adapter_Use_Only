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
    ArrayList names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        listview_searchone = findViewById(R.id.listview_searchone);
        searchView_one = findViewById(R.id.searchView_one);

        names = new ArrayList();
        names.add("Asgar");
        names.add("Shajar");
        names.add("Shabab");
        names.add("Ali");
        names.add("Aman");
        names.add("Shuja");
        names.add("Arkan");
        names.add("Akbar");
        names.add("Rehan");
        names.add("Atahar");
        names.add("aaaa");
        names.add("bcdfrghj");



        SearchAdaptor searchAdaptor = new SearchAdaptor(this, names);
        listview_searchone.setAdapter(searchAdaptor);

        searchView_one.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                searchAdaptor.myFilter(s);
                return false;
            }
        });
    }
}