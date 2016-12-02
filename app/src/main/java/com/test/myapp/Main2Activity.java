package com.test.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("[Activity Life Cycle]","onCreate() 호출");

        // 버튼을 찾아서 버튼에 대한 이벤트 리스너를 붙인다.
        Button btn = (Button)findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "버튼이 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // Activity가 시작되면 호출되는 메소드.
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("[Activity Life Cycle]", "onStart() 호출");

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("[Activity Life Cycle]", "onResume() 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("[Activity Life Cycle]", "onPause() 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("[Activity Life Cycle]", "onStop() 호출");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("[Activity Life Cycle]", "onRestart() 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("[Activity Life Cycle]", "onDestroy() 호출");
    }
}
