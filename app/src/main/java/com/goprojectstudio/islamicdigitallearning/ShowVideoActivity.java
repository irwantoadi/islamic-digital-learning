package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class ShowVideoActivity extends AppCompatActivity {

    ImageButton btn_home, btn_back, btn_ustad;
    private MediaController mc;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_video);
        btn_home = findViewById(R.id.btn_home);
        btn_back = findViewById(R.id.btn_back);
        btn_ustad = findViewById(R.id.btn_ustad);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EduVideoActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_ustad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EduVideoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        VideoView vd = findViewById(R.id.videoplayer);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.video);
        mc = new MediaController(this);
        vd.setMediaController(mc);
        vd.setVideoURI(uri);
        vd.start();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), EduVideoActivity.class);
        startActivity(intent);
        finish();
    }
}
