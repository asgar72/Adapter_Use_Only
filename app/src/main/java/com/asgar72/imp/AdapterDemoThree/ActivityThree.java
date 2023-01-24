package com.asgar72.imp.AdapterDemoThree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.asgar72.imp.R;

//In this activity use the ArrayAdapter only
public class ActivityThree extends AppCompatActivity {
    String[] name_arr = {"Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan", "Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan", "Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan", "Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan"};
    ListView listview_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        listview_three =findViewById(R.id.listview_three);

        //agar aik single list hai toh ham log adapter ko yahi par create kr skte hai aur directly display krwa sakte hai

        ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<String>(this,R.layout.ui_view_three,R.id.text_view1,name_arr);
        listview_three.setAdapter(arrayAdapter);
    }
}