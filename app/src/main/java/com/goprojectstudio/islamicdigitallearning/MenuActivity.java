package com.goprojectstudio.islamicdigitallearning;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    ImageButton btn_sejarah, btn_materi, btn_edu, btn_milenial, btn_report, btn_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_sejarah = findViewById(R.id.btn_sejarah);
        btn_materi = findViewById(R.id.btn_materi);
        btn_edu = findViewById(R.id.btn_edu_video);
        btn_milenial = findViewById(R.id.btn_alquran);
        btn_report = findViewById(R.id.btn_report);
        btn_quiz = findViewById(R.id.btn_quiz);

        btn_sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SejarahActivity.class);
                startActivity(intent);
            }
        });
        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
                startActivity(intent);
            }
        });
        btn_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EduVideoActivity.class);
                startActivity(intent);
            }
        });
        btn_milenial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlquranMilenialActivity.class);
                startActivity(intent);
            }
        });
        btn_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlquranReportActivity.class);
                startActivity(intent);
            }
        });
        btn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        myAlert(MenuActivity.this);
    }
    private void myAlert(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Keluar?")
                .setMessage("Apakah yakin akan keluar aplikasi?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}
