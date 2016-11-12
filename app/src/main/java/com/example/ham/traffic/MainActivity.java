package com.example.ham.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createLisview();
    }

    private void createLisview(){
        Mydata objectMyData = new Mydata();
        int[] intIcon = objectMyData.icon();
        String[] strTitle = objectMyData.title();

        Madapter objMyAdapter = new Madapter(MainActivity.this, intIcon, strTitle);
        ListView myListView = (ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);
        //System.err.println(Arrays.toString(intIcon));
        //System.err.println(Arrays.toString(strTitle));

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                myIntentToDetail(i);
            }
        });
    }

    private void myIntentToDetail(int inclick) {
        Intent object = new Intent(MainActivity.this, ShowDetailActivity.class);
        object.putExtra("click", inclick);
        startActivity(object);
    }

    public void clickAboutMe(View view){
        Intent objectIntent = new Intent(Intent.ACTION_VIEW);
        objectIntent.setData(Uri.parse("http://androidthai.in.th/about-me.html"));
        startActivity(objectIntent);
    }
}
