package com.example.speedywords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
    }

    //takes user to the splash screen
    public void tosplash(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

}