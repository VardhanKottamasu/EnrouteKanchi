package com.example.enroutekanchi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp=MediaPlayer.create(MainActivity.this,R.raw.temple_bell);
        mp.start();
        int SPLASH_TIME_OUT=2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(MainActivity.this, HomeScreen.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
