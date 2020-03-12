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

public class SorbonnoBangla extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorbonno_bangla);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(11)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(11, AudioManager.STREAM_MUSIC, 0);
        }
        sound1 = soundPool.load(this, R.raw.soreo, 1);
        sound2 = soundPool.load(this, R.raw.sorea, 1);
        sound3 = soundPool.load(this, R.raw.rossoi, 1);
        sound4 = soundPool.load(this, R.raw.soreo, 1);
        sound5 = soundPool.load(this, R.raw.rossou, 1);
        sound6 = soundPool.load(this, R.raw.dirghou, 1);
        sound7 = soundPool.load(this, R.raw.rri, 1);
        sound8 = soundPool.load(this, R.raw.ay, 1);
        sound9 = soundPool.load(this, R.raw.oi, 1);
        sound10 = soundPool.load(this, R.raw.ow, 1);
        sound11 = soundPool.load(this, R.raw.ou, 1);

    }


    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button2:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button3:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button4:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button5:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button6:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button7:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button8:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button9:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button10:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button11:
                soundPool.play(sound10, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button12:
                soundPool.play(sound11, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
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

