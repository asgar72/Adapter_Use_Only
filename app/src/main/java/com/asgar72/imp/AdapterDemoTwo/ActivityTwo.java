package com.asgar72.imp.AdapterDemoTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.asgar72.imp.R;

public class ActivityTwo extends AppCompatActivity {

    ListView listview_two;

    int[] animal_imgs = {R.drawable.lion, R.drawable.dog, R.drawable.dear, R.drawable.picock, R.drawable.parrot,R.drawable.lion, R.drawable.dog, R.drawable.dear, R.drawable.picock, R.drawable.parrot};
    String[] animal_names={"Lion","Dog","Dear","pickok","Parrot","Lion","Dog","Dear","pickok","Parrot"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        listview_two = findViewById(R.id.listview_two);
        MyAdaptorsTwo adaptorsTwo = new MyAdaptorsTwo(getApplicationContext(),animal_imgs,animal_names);
        listview_two.setAdapter(adaptorsTwo);
    }
}