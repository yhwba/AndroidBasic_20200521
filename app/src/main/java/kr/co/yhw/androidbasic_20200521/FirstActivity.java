package kr.co.yhw.androidbasic_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.yhw.androidbasic_20200521.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_first);
        setupEvent();
        setValues();
    }
    void setupEvent(){
        binding.goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

//                이전화면으로 돌아갈때는 Intent를 사용하지 않는다
//                Intent는 새 화면을 만들어내는 기능이 포함되어있다
//                ==> 돌아가는게 아니라, 다른 새화면을 앉아주는 효과가 발생생
//               Intent myIntent = new Intent(FirstActivity.this,MainActivity.class);
//                startActivity(myIntent);

            }

        });
    }
    void setValues(){

    }
}
