package com.thunder.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int[][] sounds = new int[3][3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,5);

        sounds[0][0] = sp.load(getApplicationContext(),R.raw.sound00,1);
        sounds[0][1] = sp.load(getApplicationContext(),R.raw.sound01,1);
        sounds[0][2] = sp.load(getApplicationContext(),R.raw.sound02,1);

        sounds[1][0] = sp.load(getApplicationContext(),R.raw.sound10,1);
        sounds[1][1] = sp.load(getApplicationContext(),R.raw.sound11,1);
        sounds[1][2] = sp.load(getApplicationContext(),R.raw.sound12,1);

        sounds[2][0] = sp.load(getApplicationContext(),R.raw.sound20,1);
        sounds[2][1] = sp.load(getApplicationContext(),R.raw.sound21,1);
        sounds[2][2] = sp.load(getApplicationContext(),R.raw.sound22,1);
    }

    public void playSound00(View v){
        sp.play(sounds[0][0],1,1,0,0,10);
    }

    public void playSound01(View v){
        sp.play(sounds[0][1],1,1,0,0,10);
    }

    public void playSound02(View v){
        sp.play(sounds[0][2],1,1,0,0,10);
    }

    public void playSound10(View v){
        sp.play(sounds[1][0],1,1,0,0,10);
    }

    public void playSound11(View v){
        sp.play(sounds[1][1],1,1,0,0,10);
    }

    public void playSound12(View v){
        sp.play(sounds[1][2],1,1,0,0,10);
    }

    public void playSound20(View v){
        sp.play(sounds[2][0],1,1,0,0,10);
    }

    public void playSound21(View v){
        sp.play(sounds[2][1],1,1,0,0,10);
    }

    public void playSound22(View v){
        sp.play(sounds[2][2],1,1,0,0,10);
    }

}
