package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class BaiTap1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap1);

        ConstraintLayout bg = (ConstraintLayout)
                findViewById(R.id.constraintLayout1);

        // Random BackGround
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.bg1);
        arrayList.add(R.drawable.bg2);
        arrayList.add(R.drawable.bg3);
        arrayList.add(R.drawable.bg4);
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        bg.setBackgroundResource(arrayList.get(index));
    }
}