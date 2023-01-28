package com.asgar72.imp.AdapterDemoOne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.asgar72.imp.R;


//In this activity which Adapter use  BaseAdapter use...
//First create a activity and create a array in activity insert the data source ..
//then complete xml file and then create a UI layout for showing data source which  form ..
public class ActivityOne extends AppCompatActivity {
    GridView gridView_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        //This is data source ...
        int[] arr_animal = {R.drawable.deer, R.drawable.dog, R.drawable.lion, R.drawable.parrot, R.drawable.picock, R.drawable.deer, R.drawable.dog, R.drawable.lion, R.drawable.parrot, R.drawable.picock,R.drawable.android,R.drawable.deer, R.drawable.dog, R.drawable.lion, R.drawable.parrot, R.drawable.picock,R.drawable.parrot, R.drawable.picock,R.drawable.android,R.drawable.deer, R.drawable.dog, R.drawable.lion};

        gridView_one = findViewById(R.id.gridView_one);

        //yaha se data soucre leke adapter mai chale gy ..aur phir adapter ko gridView mai set kra diya.
        MyAdaptorsOne adaptorsOne = new MyAdaptorsOne(getApplicationContext(), arr_animal);
        gridView_one.setAdapter(adaptorsOne);
    }
}