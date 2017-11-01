package com.work.a03;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }
    public void onToggleButton(View view) {
        ImageView image1 = (ImageView) findViewById(R.id.imageView2);
        ImageView image2 = (ImageView) findViewById(R.id.imageView3);
        ImageView image3 = (ImageView) findViewById(R.id.imageView4);
        if(image1.getVisibility() == View.VISIBLE) {
            image1.setVisibility(View.GONE);
            image2.setVisibility(View.VISIBLE);
        }else if(image2.getVisibility() == View.VISIBLE) {
            image2.setVisibility(View.GONE);
            image3.setVisibility(View.VISIBLE);
        }else if(image3.getVisibility() == View.VISIBLE) {
            image3.setVisibility(View.GONE);
            image1.setVisibility(View.VISIBLE);
        }

    }
}
