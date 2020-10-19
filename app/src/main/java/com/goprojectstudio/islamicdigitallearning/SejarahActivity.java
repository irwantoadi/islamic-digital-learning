package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SejarahActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back;
    ImageButton btn_sejarah, btn_nabi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

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

        btn_sejarah = findViewById(R.id.btn_sejarah);
        btn_nabi = findViewById(R.id.btn_nabi);
        btn_sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_nabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NabiActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
