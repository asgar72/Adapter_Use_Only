package com.asgar72.imp.AdapterDemoSeven;

import android.content.Context;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomAdaptor extends SimpleAdapter {

    Context context;
    ArrayList<HashMap<String, ?>> arrayList;

    public CustomAdaptor(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.context = context;
        this.arrayList = (ArrayList<HashMap<String, ?>>) data;
    }

    //other methods if required....
}
