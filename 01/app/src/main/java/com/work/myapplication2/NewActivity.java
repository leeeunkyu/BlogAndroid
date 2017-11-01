package com.work.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    public void onButton(View vkew){
        Toast.makeText(getApplicationContext(),"빠이",Toast.LENGTH_LONG).show();
        finish();
    }
}
