package com.example.munna.sonamonistudy;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CapitalLetter extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12, sound13, sound14, sound15, sound16, sound17, sound18, sound19, sound20, sound21, sound22, sound23, sound24, sound25, sound26;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_letter);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(26)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(26, AudioManager.STREAM_MUSIC, 0);
        }
        sound1 = soundPool.load(this, R.raw.a, 1);
        sound2 = soundPool.load(this, R.raw.b, 1);
        sound3 = soundPool.load(this, R.raw.c, 1);
        sound4 = soundPool.load(this, R.raw.d, 1);
        sound5 = soundPool.load(this, R.raw.e, 1);
        sound6 = soundPool.load(this, R.raw.f, 1);
        sound7 = soundPool.load(this, R.raw.g, 1);
        sound8 = soundPool.load(this, R.raw.h, 1);
        sound9 = soundPool.load(this, R.raw.i, 1);
        sound10 = soundPool.load(this, R.raw.j, 1);
        sound11 = soundPool.load(this, R.raw.k, 1);
        sound12 = soundPool.load(this, R.raw.l, 1);
        sound13 = soundPool.load(this, R.raw.m, 1);
        sound14 = soundPool.load(this, R.raw.n, 1);
        sound15 = soundPool.load(this, R.raw.o, 1);
        sound16 = soundPool.load(this, R.raw.p, 1);
        sound17 = soundPool.load(this, R.raw.q, 1);
        sound18 = soundPool.load(this, R.raw.r, 1);
        sound19 = soundPool.load(this, R.raw.s, 1);
        sound20 = soundPool.load(this, R.raw.t, 1);
        sound21 = soundPool.load(this, R.raw.u, 1);
        sound22 = soundPool.load(this, R.raw.v, 1);
        sound23 = soundPool.load(this, R.raw.w, 1);
        sound24 = soundPool.load(this, R.raw.x, 1);
        sound25 = soundPool.load(this, R.raw.y, 1);
        sound26 = soundPool.load(this, R.raw.z, 1);



    }
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button10:
                soundPool.play(sound10, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button11:
                soundPool.play(sound11, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button12:
                soundPool.play(sound12, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button13:
                soundPool.play(sound13, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                // soundPool.autoPause();
                break;
            case R.id.button14:
                soundPool.play(sound14, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button15:
                soundPool.play(sound15, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button16:
                soundPool.play(sound16, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button17:
                soundPool.play(sound17, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button18:
                soundPool.play(sound18, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button19:
                soundPool.play(sound19, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button20:
                soundPool.play(sound20, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button21:
                soundPool.play(sound21, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button22:
                soundPool.play(sound22, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button23:
                soundPool.play(sound23, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button24:
                soundPool.play(sound24, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button25:
                soundPool.play(sound25, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button26:
                soundPool.play(sound26, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
        }
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }


}
