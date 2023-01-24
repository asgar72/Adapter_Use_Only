package com.asgar72.imp.AdapterDemoTwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.asgar72.imp.R;

public class MyAdaptorsTwo extends BaseAdapter {

    // this is instance variable..
    Context context;
    int[] animal_img;
    String[] animal_names;
    LayoutInflater inflater;

    MyAdaptorsTwo(Context context, int[] animal_img, String[] animal_names) {
        this.context = context;
        this.animal_img = animal_img;
        this.animal_names=animal_names;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animal_img.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.ui_view_two, null);

        ImageView imageView = view.findViewById(R.id.imgview_two);
        TextView textView = view.findViewById(R.id.textView_two);

        imageView.setImageResource(animal_img[i]);
        textView.setText(animal_names[i]);
        return view;
    }
}
