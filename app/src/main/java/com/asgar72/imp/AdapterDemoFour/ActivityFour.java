package com.asgar72.imp.AdapterDemoFour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.asgar72.imp.R;
//In this activity which Adapter use  ArrayAdapter use...
public class ActivityFour extends AppCompatActivity implements AdapterView.OnItemSelectedListener
     {
    Spinner spinner_four;
    String[] name_arr = {"Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan", "Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan", "Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan", "Asgar", "Ali", "Sahil", "Amar", "Shajar", "Dilshad", "Hasan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        spinner_four = findViewById(R.id.spinner_four);
        spinner_four.setOnItemSelectedListener(this);


        //second method use the on click without  implement other method in this activity
//        spinner_four.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(ActivityFour.this, "Name is : "+ name_arr[i], Toast.LENGTH_SHORT).show();
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//            }
//        });



        //Jab bhe aik single list ho toh direct array adapter ka use kr lo .
        // <> ye genric hota hai
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, name_arr);
        spinner_four.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int index, long l) {
        Toast.makeText(this, "Name is : " + name_arr[index], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}