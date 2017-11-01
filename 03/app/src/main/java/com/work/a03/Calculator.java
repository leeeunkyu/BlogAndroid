package com.work.a03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Calculator extends AppCompatActivity {
    public String data1=null;
    public String data2=null;
    public String state = null;
    EditText editText;
    TextView textView;
    //findViewById -> lookup 용도
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //setContentView xml vie 들이 메모리에 할당
        init();
    }
    public void init() {
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView2);
    }
    public void onClickedPlus(View view) {
        if(data1 ==null) {
            data1 = editText.getText().toString();
            textView.setText(data1);
            editText.setText("");
        }else{
            switch (state){
                case "plus":
                    data2 = ""+(Float.parseFloat(data1) + Float.parseFloat(editText.getText().toString()));
                    break;
                case "minous":
                    data2 = ""+(Float.parseFloat(data1) - Float.parseFloat(editText.getText().toString()));
                    break;
                case "multi":
                    data2 = ""+(Float.parseFloat(data1) * Float.parseFloat(editText.getText().toString()));
                    break;
                case "division":
                    data2 = ""+(Float.parseFloat(data1) / Float.parseFloat(editText.getText().toString()));
                    break;
            }
            textView.setText(data2);
            editText.setText("");
            data1 = data2;
        }
        state = "plus";
        Toast.makeText(getApplicationContext(),""+data2,Toast.LENGTH_LONG).show();
        Log.i("값",""+data2);
    }
    public void onClickedMinous(View view) {
        if(data1 ==null) {
            data1 = editText.getText().toString();
            textView.setText(data1);
            editText.setText("");
        }else{
            switch (state){
                case "plus":
                    data2 = ""+(Float.parseFloat(data1) + Float.parseFloat(editText.getText().toString()));
                    break;
                case "minous":
                    data2 = ""+(Float.parseFloat(data1) - Float.parseFloat(editText.getText().toString()));
                    break;
                case "multi":
                    data2 = ""+(Float.parseFloat(data1) * Float.parseFloat(editText.getText().toString()));
                    break;
                case "division":
                    data2 = ""+(Float.parseFloat(data1) / Float.parseFloat(editText.getText().toString()));
                    break;
            }            textView.setText(data2);
            editText.setText("");
            data1 = data2;
        }
        state = "minous";

        Toast.makeText(getApplicationContext(),""+data2,Toast.LENGTH_LONG).show();
        Log.i("값",""+data2);
    }
    public void onClickedMulti(View view) {
           if(data1 ==null) {
            data1 = editText.getText().toString();
            textView.setText(data1);
            editText.setText("");
        }else{
            switch (state){
                case "plus":
                    data2 = ""+(Float.parseFloat(data1) + Float.parseFloat(editText.getText().toString()));
                    break;
                case "minous":
                    data2 = ""+(Float.parseFloat(data1) - Float.parseFloat(editText.getText().toString()));
                    break;
                case "multi":
                    data2 = ""+(Float.parseFloat(data1) * Float.parseFloat(editText.getText().toString()));
                    break;
                case "division":
                    data2 = ""+(Float.parseFloat(data1) / Float.parseFloat(editText.getText().toString()));
                    break;
            }            textView.setText(data2);
            editText.setText("");
            data1 = data2;
        }
        state = "multi";

        Toast.makeText(getApplicationContext(),""+data2,Toast.LENGTH_LONG).show();
        Log.i("값",""+data2);
    }
    public void onClickedDivision(View view) {
           if(data1 ==null) {
            data1 = editText.getText().toString();
            textView.setText(data1);
            editText.setText("");
        }else{
            switch (state){
                case "plus":
                    data2 = ""+(Float.parseFloat(data1) + Float.parseFloat(editText.getText().toString()));
                    break;
                case "minous":
                    data2 = ""+(Float.parseFloat(data1) - Float.parseFloat(editText.getText().toString()));
                    break;
                case "multi":
                    data2 = ""+(Float.parseFloat(data1) * Float.parseFloat(editText.getText().toString()));
                    break;
                case "division":
                    data2 = ""+(Float.parseFloat(data1) / Float.parseFloat(editText.getText().toString()));
                    break;
            }            textView.setText(data2);
            editText.setText("");
            data1 = data2;
        }
        state = "division";

        Toast.makeText(getApplicationContext(),""+data2,Toast.LENGTH_LONG).show();
        Log.i("값",""+data2);
    }
    public void onResult(View view) {
        data2 = editText.getText().toString();
        switch (state){
            case "plus":
                data1 = ""+(Float.parseFloat(data1) + Float.parseFloat(data2));
                break;
            case "minous":
                data1 = ""+(Float.parseFloat(data1) - Float.parseFloat(data2));
                break;
            case "multi":
                data1 = ""+(Float.parseFloat(data1) * Float.parseFloat(data2));
                break;
            case "division":
                data1 = ""+(Float.parseFloat(data1) / Float.parseFloat(data2));
                break;
        }
        editText.setText("");
        textView.setText(data1);
        Toast.makeText(getApplicationContext(),""+data1,Toast.LENGTH_LONG).show();
        data1 = null;
        data2 = null;
    }
    public void onReset(View view) {
        data1 = null;
        data2 = null;
        textView.setText("결과");
        editText.setText("");
    }

}
