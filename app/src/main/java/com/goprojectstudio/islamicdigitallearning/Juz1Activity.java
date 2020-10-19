package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Juz1Activity extends AppCompatActivity {

    ImageButton btn_home, btn_back, btn_juz1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juz1);
        btn_home = findViewById(R.id.btn_home);
        btn_back = findViewById(R.id.btn_back);
        btn_juz1 = findViewById(R.id.btn_juz1);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlquranReportActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_juz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlquranReportActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), AlquranReportActivity.class);
        startActivity(intent);
        finish();
    }
}
