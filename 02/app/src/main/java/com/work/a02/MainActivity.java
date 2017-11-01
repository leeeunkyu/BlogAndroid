package com.work.a02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButton(View view){
        EditText editText = (EditText) findViewById(R.id.editText3);
        Toast.makeText(getApplicationContext(),editText.getText().toString(),Toast.LENGTH_LONG).show();
    }

}
