package com.asgar72.imp.AdapterDemoEight;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.asgar72.imp.R;

import java.util.ArrayList;

public class SearchAdaptor extends BaseAdapter {

    Context context;
    ArrayList al_names;
    LayoutInflater layoutInflater;

    ArrayList al_new_names;

    //this is constructor
    public SearchAdaptor(Context context, ArrayList names) {
        this.context = context;
        this.al_names = names;
        layoutInflater = LayoutInflater.from(context);

        //sare name ko aik alag array mai store krna
        al_new_names = new ArrayList();
        al_new_names.addAll(al_names);
    }

    @Override
    public int getCount() {
        return al_names.size();
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
        View view1 = layoutInflater.inflate(R.layout.ui_view_eight, null);
        TextView tv = view1.findViewById(R.id.tvname);
        tv.setText(al_names.get(i).toString());
        return view1;
    }

    // this is my method
    public void myFilter(String str)
    {
        al_names.clear();
        for (Object name_obj : al_new_names)
        {
            if (name_obj.toString().contains(str)) // ye check krega ke maine jo search bar mai type kiya hai oo uske andar hai ya nahi
            {
                al_names.add(name_obj.toString());
            }
        }
        notifyDataSetChanged(); // ye wala method dubara se getView method ko call krega our phir se list create krega
    }
}
