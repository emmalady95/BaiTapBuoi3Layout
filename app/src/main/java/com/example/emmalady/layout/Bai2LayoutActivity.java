package com.example.emmalady.layout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bai2LayoutActivity extends AppCompatActivity {

    private Button btnColor1, btnColor2, btnColor3, btnClear, btnNext;
    private TextView tvChangeColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_layout);
        btnColor1 = (Button) findViewById(R.id.btnColor1);
        btnColor2 = (Button) findViewById(R.id.btnColor2);
        btnColor3 = (Button) findViewById(R.id.btnColor3);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnNext = (Button) findViewById(R.id.btnNext);
        tvChangeColor = (TextView) findViewById(R.id.tvSetColor);

        //Catch Events
        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundColor(Color.parseColor("#FF3030"));
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundColor(Color.parseColor("#FFFF00"));
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundColor(Color.parseColor("#191970"));
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNextBai3Layout = new Intent(Bai2LayoutActivity.this, Bai3LayoutActivity.class);
                startActivity(iNextBai3Layout);
            }
        });
    }
}
