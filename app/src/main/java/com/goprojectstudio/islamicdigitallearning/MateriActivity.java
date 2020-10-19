package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MateriActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back;
    ImageButton btn_fiqih, btn_materi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        btn_home = findViewById(R.id.btn_home);
        btn_back = findViewById(R.id.btn_back);
        btn_materi = findViewById(R.id.btn_materi);

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
        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_fiqih = findViewById(R.id.btn_fiqih);
        btn_fiqih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FiqihActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
