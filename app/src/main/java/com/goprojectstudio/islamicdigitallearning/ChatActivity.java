package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChatActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back, btn_tanya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        btn_home = findViewById(R.id.btn_home);
        btn_back = findViewById(R.id.btn_back);
        btn_tanya = findViewById(R.id.btn_tanya);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlquranMilenialActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_tanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlquranMilenialActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), AlquranMilenialActivity.class);
        startActivity(intent);
        finish();
    }
}
