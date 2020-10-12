package com.example.masterdflow2;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    MediaPlayer sing;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        sing= MediaPlayer.create(this,R.raw.ping);
        sing.start();
        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {
                sing.stop();
                launchMDF();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 5000);
    }

    public void launchMDF()
    {
        Intent intent = new Intent(this, websiteListActivity.class);
        startActivity(intent);
    }
}
