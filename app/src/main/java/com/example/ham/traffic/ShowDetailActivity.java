package com.example.ham.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    private TextView showTitleTextView, showDetailTextView;
    private ImageView showTrafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        bindWidget();
        showWidget();
    }

    private void showWidget() {
        int intClick = getIntent().getIntExtra("click", 0);

        Mydata objectMyData = new Mydata();
        String[] strTitle = objectMyData.title();
        showTitleTextView.setText(strTitle[intClick] + " (" + intClick + ")");

        int[] intDrawable = objectMyData.icon();
        showTrafficImageView.setImageResource(intDrawable[intClick]);

        String[] strDetail = getResources().getStringArray(R.array.traffic_detail);
        showDetailTextView.setText(strDetail[intClick]);
    }

    private void bindWidget() {
        showTitleTextView = (TextView) findViewById(R.id.textViewDetailTitle);
        showDetailTextView = (TextView) findViewById(R.id.textViewDetails);
        showTrafficImageView = (ImageView) findViewById(R.id.imageViewDetail);
    }
    /*
    @Override
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_show_detail, menu);
        return true;
    }*/
}
