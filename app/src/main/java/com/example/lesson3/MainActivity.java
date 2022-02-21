package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout_screen);

        Button btnClick = findViewById(R.id.btn_click);

        ImageView ivBg = findViewById(R.id.imv_bg);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ivBg.getVisibility() == View.VISIBLE) {
                    ivBg.setVisibility(View.GONE);
                } else {
                    ivBg.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}