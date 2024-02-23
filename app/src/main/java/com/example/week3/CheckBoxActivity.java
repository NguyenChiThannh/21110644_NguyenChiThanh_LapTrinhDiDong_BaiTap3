package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        ConstraintLayout bg = (ConstraintLayout)
                findViewById(R.id.constraintLayout1);

        // CheckBox
        CheckBox ck1 = (CheckBox) findViewById(R.id.checkBox);
        ck1.setOnCheckedChangeListener(new
            CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                {
                if(isChecked){
                    bg.setBackgroundResource(R.drawable.bg3);
                }
                else{
                    bg.setBackgroundResource(R.drawable.bg4);
                }
            }
        });

        //RadioGroup
        RadioGroup radioGroup = (RadioGroup)
                findViewById(R.id.radioGroup1);
        radioGroup.setOnCheckedChangeListener(new
        RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group,
        int checkedId) {
        switch (checkedId){
            case R.id.radioButton:
                bg.setBackgroundResource(R.drawable.bg3);
                break;
            case R.id.radioButton2:
                bg.setBackgroundResource(R.drawable.bg4);
                break;
                }
            }
        });
    }
}