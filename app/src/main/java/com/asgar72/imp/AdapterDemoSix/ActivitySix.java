package com.asgar72.imp.AdapterDemoSix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.asgar72.imp.R;

import java.util.ArrayList;
import java.util.HashMap;

public class ActivitySix extends AppCompatActivity {
                                //Use the SimpleAdaptor
    ListView listview_six;
    int[] animal_imgs={R.drawable.deer,R.drawable.dog,R.drawable.lion,R.drawable.parrot,R.drawable.peacock};
    String[] animal_name={"Deer","Dog","Lion","Parrot","Peacock"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

       listview_six = findViewById(R.id.listview_six);

        ArrayList<HashMap<String, ?>> arrayList = new ArrayList<HashMap<String, ?>>();

        for(int i=0; i<animal_imgs.length; i++)
        {
            HashMap<String, String> hm1 = new HashMap<String, String>();
            hm1.put("image",animal_imgs[i]+"");
            hm1.put("name",animal_name[i]);
            arrayList.add(hm1);
        }
        String[] from={"image","name"};
        int[] to={R.id.imageview_six,R.id.textview_six};

       SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.ui_view_six,from,to);
       listview_six.setAdapter(simpleAdapter);

    }
}