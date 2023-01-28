package com.asgar72.imp.AdapterDemoFive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.asgar72.imp.R;

import java.util.ArrayList;


public class MyAdaptorsFive extends ArrayAdapter<Animals> {
    ArrayList<Animals> animal_list;
    LayoutInflater layoutInflater ;
    public MyAdaptorsFive( Context context, int resource, ArrayList<Animals> objects)
    {
        super(context, resource, objects);
        animal_list = objects;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animal_list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = layoutInflater.inflate(R.layout.ui_view_five,null);

        ImageView imageView = v.findViewById(R.id.imageview_five);
        TextView textView = v.findViewById(R.id.textview_Five);

        imageView.setImageResource(animal_list.get(position).getAnimal_image());
        textView.setText(animal_list.get(position).getAnimal_name());
        return v;
    }
}
