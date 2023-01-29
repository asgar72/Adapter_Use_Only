package com.asgar72.imp.AdapterDemoSeven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.asgar72.imp.AdapterDemoSix.CustomAdaptor;
import com.asgar72.imp.R;

import java.util.ArrayList;
import java.util.HashMap;
                                            //Custom_Adaptor
public class ActivitySeven extends AppCompatActivity {
    ListView listview_Seven;
    int[] animal_imgs={R.drawable.deer,R.drawable.dog,R.drawable.lion,R.drawable.parrot,R.drawable.peacock};
    String[] animal_name={"Deer","Dog","Lion","Parrot","Peacock"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        listview_Seven = findViewById(R.id.listview_Seven);


        ArrayList<HashMap<String, ?>> arrayList = new ArrayList<HashMap<String, ?>>();

        for(int i=0; i<animal_imgs.length; i++)
        {
            HashMap<String, String> hm1 = new HashMap<String, String>();
            hm1.put("image",animal_imgs[i]+"");
            hm1.put("name",animal_name[i]);
            arrayList.add(hm1);
        }
        String[] from={"image","name"};
        int[] to={R.id.imageview_seven,R.id.textview_seven};

        CustomAdaptor customAdaptor = new CustomAdaptor(this,arrayList,R.layout.ui_view_seven,from,to);
        listview_Seven.setAdapter(customAdaptor);

        listview_Seven.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivitySeven.this, animal_name[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}