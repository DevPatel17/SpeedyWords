//Name: Dev Patel
//Date: June 15, 2020
//Project name: Speedy Words Game

package com.example.speedywords;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysong = MediaPlayer.create(this, R.raw.sound);
        mysong.start();
    }


    //takes user to the game screen
    public void togame(View view) {
        mysong.stop();
        Intent m = new Intent(this, GameScreen.class);
        startActivity(m);
    }

    //takes user to the instructions screen
    public void toins(View view) {
        mysong.stop();
        Intent g = new Intent(this, Instructions.class);
        startActivity(g);


    }


}