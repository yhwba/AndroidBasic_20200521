package kr.co.yhw.androidbasic_20200521;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEvents();
        setValues();
    }
//     이벤트 처리 코드를 모아두는 곳
    void setupEvents(){

    }
//    화면에 나와야할 데이터 세팅 코드 모아두는곳
    void setValues() {

    }
}
