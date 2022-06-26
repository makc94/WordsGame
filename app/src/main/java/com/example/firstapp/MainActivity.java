package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView play, sound, music, vibrate, off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        sound = findViewById(R.id.sound);
        music = findViewById(R.id.music);
        vibrate = findViewById(R.id.vibrate);
        off = findViewById(R.id.off);

        play.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("SOUND-SOUND-SOUND-SOUND-SOUND");
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("MUSIC-MUSIC-MUSIC-MUSIC-MUSIC");
            }
        });
        vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("VIBRATE-VIBRATE-VIBRATE-VIBRATE");
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("OFF-OFF-OFF-OFF");
            }
        });
    }
}