package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EduVideoActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back;
    ImageButton btn_edu, btn_ustad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu_video);
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

        btn_edu = findViewById(R.id.btn_edu_video);
        btn_ustad = findViewById(R.id.btn_ustad);
        btn_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_ustad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowVideoActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
