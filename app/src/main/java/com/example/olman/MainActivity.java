package com.example.olman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Запуск neiron
        ImageButton button = findViewById(R.id.neironka);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.hyperpc", "com.example.hyperpc.Splashscreen"));
                startActivity(intent);
            }
        });
    }

    public void openInfo(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void openDangerzone(View v) {
        Intent intent = new Intent(this, dangerzone.class);
        startActivity(intent);
    }

    public void openDetail(View v) {
        Intent intent = new Intent(this, detail.class);
        startActivity(intent);
    }

    public void openSortirovka(View v) {
        Intent intent = new Intent(this, sortirovka.class);
        startActivity(intent);
    }

    public void openFiltr(View v) {
        Intent intent = new Intent(this, filtr.class);
        startActivity(intent);
    }

    public void openKontrol(View v) {
        Intent intent = new Intent(this, kontrol.class);
        startActivity(intent);
    }

    public void openSborka(View v) {
        Intent intent = new Intent(this, sborka.class);
        startActivity(intent);
    }
}