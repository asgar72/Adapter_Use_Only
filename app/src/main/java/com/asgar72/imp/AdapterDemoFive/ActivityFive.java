package com.asgar72.imp.AdapterDemoFive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.asgar72.imp.R;

import java.util.ArrayList;

public class ActivityFive extends AppCompatActivity {
    ListView listview_five;
    ArrayList animal_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        listview_five = findViewById(R.id.listview_five);

        Animals animals = new Animals(R.drawable.deer,"Deer");


        //create a arraylist object
        animal_List = new ArrayList();
        //Array list mai sirf aik object store ho skta hai but constructor ka use krne multiple object store kr skte hai
        //animal_List.add(animals);

        //------------below is custom arraylist --------------------------///
        animal_List.add(new Animals(R.drawable.deer,"Deer"));
        animal_List.add(new Animals(R.drawable.dog,"Dog"));
        animal_List.add(new Animals(R.drawable.lion,"Lion"));
        animal_List.add(new Animals(R.drawable.parrot,"Parrot"));
        animal_List.add(new Animals(R.drawable.picock,"Pickock"));
        animal_List.add(new Animals(R.drawable.deer,"Deer"));
        animal_List.add(new Animals(R.drawable.dog,"Dog"));
        animal_List.add(new Animals(R.drawable.lion,"Lion"));
        //---------------------------------------------------------------//


        // set adaptors
        MyAdaptorsFive adaptorsFive = new MyAdaptorsFive(this,R.layout.ui_view_five,animal_List);
        listview_five.setAdapter(adaptorsFive);

    }
}