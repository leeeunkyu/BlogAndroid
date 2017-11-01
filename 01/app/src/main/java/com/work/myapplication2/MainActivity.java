package com.work.myapplication2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2.이벤트 처리 리서너 연결구현
        //이벤트 처리위한 객체 검색:id 기반 검색
        //R -> 모든 리소스  안드로이드에서 가장 최상위객체는 View
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        //이벤트 객체에 이벤트 리스너를 연결설정
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"두번째버튼이에요",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewActivity.class);
                startActivity(intent);
            }
        });
    }

    //button click 이벤트 처리 메서드 구현
    public void onButtonClicked(View viewv){
        //메시지 출력
        Toast.makeText(getApplicationContext(),"버튼을 눌렀어요",Toast.LENGTH_LONG).show();
    }

    public void onButtonClicked2(View view){
        Toast.makeText(getApplicationContext(),"전화걸기",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-0000-0000"));
        startActivity(intent);

    }
}
