package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class BaiTap2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap2);

        ConstraintLayout bg = (ConstraintLayout)
                findViewById(R.id.constraintLayout1);

        Switch sw = (Switch) findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){ //isChecked = true
                    bg.setBackgroundResource(R.drawable.bg3);
                }
                else{
                    bg.setBackgroundResource(R.drawable.bg4);
                }
            }
        });
    }
}