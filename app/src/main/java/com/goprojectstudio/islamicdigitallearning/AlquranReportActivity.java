package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AlquranReportActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back;
    ImageButton btn_report, btn_juz1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alquran_report);
        btn_home = findViewById(R.id.btn_home);
        btn_back = findViewById(R.id.btn_back);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_report = findViewById(R.id.btn_alquran_report);
        btn_juz1 = findViewById(R.id.btn_juz1);

        btn_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_juz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Juz1Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
