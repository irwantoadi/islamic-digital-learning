package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NabiActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back, btn_nabi, btn_isa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nabi);

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
                Intent intent = new Intent(getApplicationContext(), SejarahActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_nabi = findViewById(R.id.btn_nabi);
        btn_isa = findViewById(R.id.btn_isa);
        btn_nabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SejarahActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_isa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IsaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), SejarahActivity.class);
        startActivity(intent);
        finish();
    }
}
