package com.work.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClickedCard(View view){
        Intent intent = new Intent(getApplicationContext(),cardActivity.class);
        startActivity(intent);
    }
    public void onButtonClickedInfo(View view){
        Intent intent = new Intent(getApplicationContext(),MyInfo.class);
        startActivity(intent);
    }
}
