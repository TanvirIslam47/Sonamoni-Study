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

public class Benjonbonno extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12, sound13, sound14, sound15, sound16, sound17, sound18, sound19, sound20, sound21, sound22, sound23, sound24, sound25, sound26,sound27,sound28,sound29,sound30,sound31,sound32,sound33,sound34,sound35,sound36,sound37,sound38,sound39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benjonbonno);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(39)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(39, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundPool.load(this, R.raw.ka, 1);
        sound2 = soundPool.load(this, R.raw.kha, 1);
        sound3 = soundPool.load(this, R.raw.ga, 1);
        sound4 = soundPool.load(this, R.raw.gha, 1);
        sound5 = soundPool.load(this, R.raw.ungo, 1);
        sound6 = soundPool.load(this, R.raw.ca, 1);
        sound7 = soundPool.load(this, R.raw.cha, 1);
        sound8 = soundPool.load(this, R.raw.borgiojo, 1);
        sound9 = soundPool.load(this, R.raw.jha, 1);
        sound10 = soundPool.load(this, R.raw.iio, 1);
        sound11 = soundPool.load(this, R.raw.tta, 1);
        sound12 = soundPool.load(this, R.raw.ttha, 1);
        sound13 = soundPool.load(this, R.raw.dda, 1);
        sound14 = soundPool.load(this, R.raw.ddha, 1);
        sound15 = soundPool.load(this, R.raw.murdhannana, 1);
        sound16 = soundPool.load(this, R.raw.ta, 1);
        sound17 = soundPool.load(this, R.raw.tha, 1);
        sound18 = soundPool.load(this, R.raw.da, 1);
        sound19 = soundPool.load(this, R.raw.dha, 1);
        sound20 = soundPool.load(this, R.raw.dantana, 1);
        sound21 = soundPool.load(this, R.raw.pa, 1);
        sound22 = soundPool.load(this, R.raw.pha, 1);
        sound23 = soundPool.load(this, R.raw.ba, 1);
        sound24 = soundPool.load(this, R.raw.bha, 1);
        sound25 = soundPool.load(this, R.raw.mo, 1);
        sound26 = soundPool.load(this, R.raw.ontosthoja, 1);
        sound27 = soundPool.load(this, R.raw.ro, 1);
        sound28 = soundPool.load(this, R.raw.la, 1);
        sound29 = soundPool.load(this, R.raw.talobbosha, 1);
        sound30 = soundPool.load(this, R.raw.murdhannasha, 1);
        sound31 = soundPool.load(this, R.raw.dontosha, 1);
        sound32 = soundPool.load(this, R.raw.ha, 1);
        sound33 = soundPool.load(this, R.raw.doyshunnora, 1);
        sound34 = soundPool.load(this, R.raw.dhoyshunnora, 1);
        sound35 = soundPool.load(this, R.raw.ontosthoo, 1);
        sound36 = soundPool.load(this, R.raw.khondota, 1);
        sound37 = soundPool.load(this, R.raw.onusshar, 1);
        sound38 = soundPool.load(this, R.raw.bishorgo, 1);
        sound39 = soundPool.load(this, R.raw.chandrabindu, 1);
//        bt1=(Button)findViewById(R.id.button20);
//        bt2=(Button)findViewById(R.id.button21);
//        bt3=(Button)findViewById(R.id.button22);
//        bt4=(Button)findViewById(R.id.button23);
//        bt5=(Button)findViewById(R.id.button24);
//        bt6=(Button)findViewById(R.id.button25);
//        bt7=(Button)findViewById(R.id.button26);
//        bt8=(Button)findViewById(R.id.button27);
//        bt9=(Button)findViewById(R.id.button28);
//        bt10=(Button)findViewById(R.id.button29);
//        bt11=(Button)findViewById(R.id.button30);
//        bt12=(Button)findViewById(R.id.button31);
//        bt13=(Button)findViewById(R.id.button32);
//        bt14=(Button)findViewById(R.id.button33);
//        bt15=(Button)findViewById(R.id.button34);
//        bt16=(Button)findViewById(R.id.button35);
//        bt17=(Button)findViewById(R.id.button37);
//        bt18=(Button)findViewById(R.id.button38);
//        bt19=(Button)findViewById(R.id.button43);
//        bt20=(Button)findViewById(R.id.button44);
//        bt21=(Button)findViewById(R.id.button45);
//        bt22=(Button)findViewById(R.id.button46);
//        bt23=(Button)findViewById(R.id.button13);
//        bt24=(Button)findViewById(R.id.button15);
//        bt25=(Button)findViewById(R.id.button);
//        bt26=(Button)findViewById(R.id.button14);
//        bt27=(Button)findViewById(R.id.button18);
//        bt28=(Button)findViewById(R.id.button16);
//        bt29=(Button)findViewById(R.id.button17);
//        bt30=(Button)findViewById(R.id.button36);
//        bt31=(Button)findViewById(R.id.button19);
//        bt32=(Button)findViewById(R.id.button39);
//        bt33=(Button)findViewById(R.id.button42);
//        bt34=(Button)findViewById(R.id.button40);
//        bt35=(Button)findViewById(R.id.button41);
//        bt36=(Button)findViewById(R.id.button49);
//        bt37=(Button)findViewById(R.id.button47);
//        bt38=(Button)findViewById(R.id.button48);
//        bt39=(Button)findViewById(R.id.button50);

//        final MediaPlayer mp1 = MediaPlayer.create(this,R.raw.ka);
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp1.start();
//            }
//        });
//        final MediaPlayer mp2 = MediaPlayer.create(this,R.raw.kha);
//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp2.start();
//            }
//        });
//        final MediaPlayer mp3 = MediaPlayer.create(this,R.raw.ga);
//        bt3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp3.start();
//            }
//        });
//        final MediaPlayer mp4 = MediaPlayer.create(this,R.raw.gha);
//        bt4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp4.start();
//            }
//        });
//        final MediaPlayer mp5 = MediaPlayer.create(this,R.raw.ungo);
//        bt5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp5.start();
//            }
//        });
//        final MediaPlayer mp6 = MediaPlayer.create(this,R.raw.ca);
//        bt6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp6.start();
//            }
//        });
//        final MediaPlayer mp7 = MediaPlayer.create(this,R.raw.cha);
//        bt7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp7.start();
//            }
//        });
//        final MediaPlayer mp8 = MediaPlayer.create(this,R.raw.borgiojo);
//        bt8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp8.start();
//            }
//        });
//        final MediaPlayer mp9 = MediaPlayer.create(this,R.raw.jha);
//        bt9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp9.start();
//            }
//        });
//        final MediaPlayer mp10 = MediaPlayer.create(this,R.raw.iio);
//        bt10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp10.start();
//            }
//        });
//        final MediaPlayer mp11 = MediaPlayer.create(this,R.raw.tta);
//        bt11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp11.start();
//            }
//        });
//        final MediaPlayer mp12 = MediaPlayer.create(this,R.raw.ttha);
//        bt12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp12.start();
//            }
//        });
//        final MediaPlayer mp13 = MediaPlayer.create(this,R.raw.dda);
//        bt13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp13.start();
//            }
//        });
//        final MediaPlayer mp14 = MediaPlayer.create(this,R.raw.ddha);
//        bt14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp14.start();
//            }
//        });
//        final MediaPlayer mp15 = MediaPlayer.create(this,R.raw.murdhannana);
//        bt15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp15.start();
//            }
//        });
//        final MediaPlayer mp16 = MediaPlayer.create(this,R.raw.ta);
//        bt16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp16.start();
//            }
//        });
//        final MediaPlayer mp17 = MediaPlayer.create(this,R.raw.tha);
//        bt17.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp17.start();
//            }
//        });
//        final MediaPlayer mp18 = MediaPlayer.create(this,R.raw.da);
//        bt18.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp18.start();
//            }
//        });
//        final MediaPlayer mp19 = MediaPlayer.create(this,R.raw.dha);
//        bt19.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp19.start();
//            }
//        });
//        final MediaPlayer mp20 = MediaPlayer.create(this,R.raw.dantana);
//        bt20.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp20.start();
//            }
//        });
//        final MediaPlayer mp21 = MediaPlayer.create(this,R.raw.pa);
//        bt21.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp21.start();
//            }
//        });
//        final MediaPlayer mp22 = MediaPlayer.create(this,R.raw.pha);
//        bt22.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp22.start();
//            }
//        });
//        final MediaPlayer mp23 = MediaPlayer.create(this,R.raw.ba);
//        bt23.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp23.start();
//            }
//        });
//        final MediaPlayer mp24 = MediaPlayer.create(this,R.raw.bha);
//        bt24.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp24.start();
//            }
//        });
//        final MediaPlayer mp25 = MediaPlayer.create(this,R.raw.mo);
//        bt25.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp25.start();
//            }
//        });
//        final MediaPlayer mp26 = MediaPlayer.create(this,R.raw.ontosthoja);
//        bt26.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp26.start();
//            }
//        });
//        final MediaPlayer mp27 = MediaPlayer.create(this,R.raw.ro);
//        bt27.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp27.start();
//            }
//        });
//        final MediaPlayer mp28 = MediaPlayer.create(this,R.raw.la);
//        bt28.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp28.start();
//            }
//        });
//        final MediaPlayer mp29 = MediaPlayer.create(this,R.raw.talobbosha);
//        bt29.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp29.start();
//            }
//        });
//        final MediaPlayer mp30 = MediaPlayer.create(this,R.raw.murdhannasha);
//        bt30.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp30.start();
//            }
//        });
//        final MediaPlayer mp31 = MediaPlayer.create(this,R.raw.dontosha);
//        bt31.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp31.start();
//            }
//        });
//        final MediaPlayer mp32 = MediaPlayer.create(this,R.raw.ha);
//        bt32.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp32.start();
//            }
//        });
//        final MediaPlayer mp33 = MediaPlayer.create(this,R.raw.doyshunnora);
//        bt33.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp33.start();
//            }
//        });
//        final MediaPlayer mp34 = MediaPlayer.create(this,R.raw.dhoyshunnora);
//        bt34.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp34.start();
//            }
//        });
//        final MediaPlayer mp35 = MediaPlayer.create(this,R.raw.ontosthoo);
//        bt35.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp35.start();
//            }
//        });
//        final MediaPlayer mp36 = MediaPlayer.create(this,R.raw.khondota);
//        bt36.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp36.start();
//            }
//        });
//        final MediaPlayer mp37 = MediaPlayer.create(this,R.raw.onusshar);
//        bt37.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp37.start();
//            }
//        });
//        final MediaPlayer mp38 = MediaPlayer.create(this,R.raw.bishorgo);
//        bt38.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp38.start();
//            }
//        });
//        final MediaPlayer mp39 = MediaPlayer.create(this,R.raw.chandrabindu);
//        bt39.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                mp39.start();
//            }
//        });


    }

    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button20:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button21:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button22:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button23:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button24:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button25:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button26:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button27:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button28:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button29:
                soundPool.play(sound10, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button30:
                soundPool.play(sound11, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button31:
                soundPool.play(sound12, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button32:
                soundPool.play(sound13, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                // soundPool.autoPause();
                break;
            case R.id.button33:
                soundPool.play(sound14, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button34:
                soundPool.play(sound15, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button35:
                soundPool.play(sound16, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button37:
                soundPool.play(sound17, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button38:
                soundPool.play(sound18, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button43:
                soundPool.play(sound19, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button44:
                soundPool.play(sound20, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button45:
                soundPool.play(sound21, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button46:
                soundPool.play(sound22, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button13:
                soundPool.play(sound23, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button15:
                soundPool.play(sound24, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button:
                soundPool.play(sound25, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button14:
                soundPool.play(sound26, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button18:
                soundPool.play(sound27, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button16:
                soundPool.play(sound28, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button17:
                soundPool.play(sound29, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button36:
                soundPool.play(sound30, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button19:
                soundPool.play(sound31, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button39:
                soundPool.play(sound32, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                //soundPool.autoPause();
                break;
            case R.id.button42:
                soundPool.play(sound33, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button40:
                soundPool.play(sound34, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button41:
                soundPool.play(sound35, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button49:
                soundPool.play(sound36, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button47:
                soundPool.play(sound37, 1, 1, 0, 0, 1);
                // soundPool.autoPause();
                break;
            case R.id.button48:
                soundPool.play(sound38, 1, 1, 0, 0, 1);
                //soundPool.autoPause();
                break;
            case R.id.button50:
                soundPool.play(sound39, 1, 1, 0, 0, 1);
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
