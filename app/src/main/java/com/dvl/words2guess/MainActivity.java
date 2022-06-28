package com.dvl.words2guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ImageView play, sound, music, vibrate, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        play = findViewById(R.id.play);
        sound = findViewById(R.id.sound);
        music = findViewById(R.id.music);
        vibrate = findViewById(R.id.vibrate);
        exit = findViewById(R.id.exit);

        play.setOnClickListener(v -> {
            Intent intent = new Intent (this, MainActivity2.class);
            startActivity(intent);
            // finish();
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

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("OFF-OFF-OFF-OFF");
            }
        });
    }
}