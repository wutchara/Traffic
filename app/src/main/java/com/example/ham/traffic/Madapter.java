package com.example.ham.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HaM on 11/11/2016.
 */

public class Madapter extends BaseAdapter{
    private Context objectCntext;
    private int[] trafficInts;
    private String[] trafficString;

    public Madapter(Context objectCntext, int[] trafficInts, String[] trafficString) {
        this.objectCntext = objectCntext;
        this.trafficInts = trafficInts;
        this.trafficString = trafficString;
    }


    @Override
    public int getCount() {
        return trafficString.length;
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
        LayoutInflater objectInflater = (LayoutInflater) objectCntext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = objectInflater.inflate(R.layout.my_listview, viewGroup, false);

        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setBackgroundResource(trafficInts[i]);
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView);
        titleTextView.setText(trafficString[i]);

        return view1;
    }
}
