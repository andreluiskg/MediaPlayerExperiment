package com.example.andre.mediaplayerexperiment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaPlayer = MediaPlayer.create(this, R.raw.musica_1);
    }

    public void playMusic(View view) {
        mMediaPlayer.start();
    }

    public void pauseMusic(View view) {
        mMediaPlayer.pause();
    }

    public void volumePlus(View view) {

    }

    public void volumeMinus(View view) {

    }

    public void forward30Sec(View view) {

    }
}
