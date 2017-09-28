package com.example.emmalady.layout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bai3LayoutActivity extends AppCompatActivity {
    private Button btnNext, btnColor1, btnColor2, btnColor3, btnClear;
    private TextView tvChangeColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_layout);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnColor1 = (Button) findViewById(R.id.btnColor1);
        btnColor2 = (Button) findViewById(R.id.btnColor2);
        btnColor3 = (Button) findViewById(R.id.btnColor3);
        btnClear = (Button) findViewById(R.id.btnClear);
        tvChangeColor = (TextView) findViewById(R.id.tvSetColor);

        //Catch Events
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNextBai4Layout = new Intent(Bai3LayoutActivity.this, Bai4LayoutActivity.class);
                startActivity(iNextBai4Layout);
            }
        });
        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundResource(R.color.Red);
                tvChangeColor.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundResource(R.color.Yellow);
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundResource(R.color.Blue);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundResource(R.color.White);

            }
        });
    }
}
