package com.hrsshuvo.floding;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mobile(View view) {
            player=MediaPlayer.create(this,R.raw.let);
            player.start();
        }


    public void laptop(View view) {
        Intent intent=new Intent(this,laptop.class);
        startActivities(new Intent[]{intent});
    }

    public void camera(View view) {
            player=MediaPlayer.create(this,R.raw.ca);
            player.start();

    }

    public void chat(View view) {
            player=MediaPlayer.create(this,R.raw.sia);
            player.start();
        }


    public void music(View view) {
            player=MediaPlayer.create(this,R.raw.mm);
            player.start();
        }

    public void add(View view) {
            player=MediaPlayer.create(this,R.raw.ss);
            player.start();
        }
    }

