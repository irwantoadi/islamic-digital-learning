package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AlquranMilenialActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back;
    ImageButton btn_tanya_ustad, btn_alquran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alquran_milenial);

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
        btn_tanya_ustad = findViewById(R.id.btn_tanya);
        btn_alquran = findViewById(R.id.btn_alquran);
        btn_tanya_ustad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChatActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_alquran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
