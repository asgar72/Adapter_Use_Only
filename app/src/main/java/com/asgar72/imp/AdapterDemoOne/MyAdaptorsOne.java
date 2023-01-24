package com.asgar72.imp.AdapterDemoOne;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.asgar72.imp.R;

public class MyAdaptorsOne extends BaseAdapter {

    //Create constructor
    Context context;
    int[] data;
    LayoutInflater inflater;

    MyAdaptorsOne(Context context, int[] data) {
                this.context = context;
                this.data = data;
                inflater = (LayoutInflater.from(context)) ;
    }


    //getCount methods count krega ke hamre data source ke andar kitne items hai.
    @Override
    public int getCount() {
        return data.length;
    }

    //koun sa item select ho raha hai uske position
    @Override
    public Object getItem(int i) {
        return null;
    }

    //items id ko ye get krega.
    @Override
    public long getItemId(int i) {
        return 0;
    }

    // jo bhe data hai usko view ko upar set krega aur return krega.
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.ui_view_one, null);
        ImageView imageView_one = view.findViewById(R.id.imageView_one);
        imageView_one.setImageResource(data[i]);
        return view;
    }
}
