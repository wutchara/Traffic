package com.example.ham.traffic;

/**
 * Created by HaM on 11/11/2016.
 */

public class Mydata {
    public int[] icon(){
        int[] intIcon = {
                R.drawable.trafic_02,
                R.drawable.trafic_04,
                R.drawable.trafic_02,
                R.drawable.trafic_04
        };
        return intIcon;
    }
    public String[] title(){
        String[] strTitle = new String[4];
        strTitle[0] = "Digger";
        strTitle[1] = "Traffic Signal";
        strTitle[2] = "Digger";
        strTitle[3] = "Traffic Signal";

        return strTitle;
    }

}
