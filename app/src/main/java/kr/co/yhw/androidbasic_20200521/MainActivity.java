package kr.co.yhw.androidbasic_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.yhw.androidbasic_20200521.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }
//     이벤트 처리 코드를 모아두는 곳
    void setupEvents(){

        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                First 액티비티로 이동
//                비행기 티켓 발권
                Intent myIntent = new Intent(MainActivity.this, FirstActivity.class);
//                실제출발
                startActivity(myIntent);

//                이 액티비티가 종료하는 코드( 이동처럼 보이도록 처리)
//                finish();
            }
        });

        binding.goToSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(secIntent);
            }
        });
    }
//    화면에 나와야할 데이터 세팅 코드 모아두는곳
    void setValues() {

    }
}
