package com.example.emmalady.layout;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bai1LayoutActivity extends AppCompatActivity {

    private Button btnSetColor, btnClear, btnNext;
    private RadioButton rdRed, rdWhite, rdBlue;
    private TextView tvChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_layout);
        btnSetColor = (Button) findViewById(R.id.btnSetColor);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnNext = (Button) findViewById(R.id.btnNext);
        rdRed = (RadioButton) findViewById(R.id.rdRed);
        rdWhite = (RadioButton) findViewById(R.id.rdWhite);
        rdBlue = (RadioButton) findViewById(R.id.rdBlue);
        tvChangeColor = (TextView) findViewById(R.id.tvChangeColor);
        //Catch Event
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvChangeColor.setBackgroundResource(R.color.Black);
                tvChangeColor.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNextBai2Layout = new Intent(Bai1LayoutActivity.this, Bai2LayoutActivity.class);
                startActivity(iNextBai2Layout);
            }
        });
        btnSetColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rdRed.isChecked()){
                    tvChangeColor.setBackgroundResource(R.color.Red);
                    tvChangeColor.setTextColor(Color.parseColor("#FFFFFF"));
                }else if(rdWhite.isChecked()){
                    tvChangeColor.setBackgroundResource(R.color.White);
                    tvChangeColor.setTextColor(Color.parseColor("#000000"));
                }else{
                    tvChangeColor.setBackgroundResource(R.color.Blue);
                    tvChangeColor.setTextColor(Color.parseColor("#FFFFFF"));
                }
            }
        });
    }
}
