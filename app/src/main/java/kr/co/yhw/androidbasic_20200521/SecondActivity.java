package kr.co.yhw.androidbasic_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import kr.co.yhw.androidbasic_20200521.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second);
        setupEvent();
        setupValue();
    }

    void setupEvent(){
        binding.goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    void setupValue(){

    }
}

