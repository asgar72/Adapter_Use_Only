package com.asgar72.imp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asgar72.imp.AdapterDemoFive.ActivityFive;
import com.asgar72.imp.AdapterDemoFour.ActivityFour;
import com.asgar72.imp.AdapterDemoOne.ActivityOne;
import com.asgar72.imp.AdapterDemoSix.ActivitySix;
import com.asgar72.imp.AdapterDemoThree.ActivityThree;
import com.asgar72.imp.AdapterDemoTwo.ActivityTwo;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2,btn3,btn4,btn_5,btn_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(),ActivityOne.class);
                startActivity(ob);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), ActivityTwo.class);
                startActivity(ob);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), ActivityThree.class);
                startActivity(ob);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), ActivityFour.class);
                startActivity(ob);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), ActivityFive.class);
                startActivity(ob);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(), ActivitySix.class);
                startActivity(ob);
            }
        });


    }
}