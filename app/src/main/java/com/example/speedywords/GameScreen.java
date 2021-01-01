package com.example.speedywords;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class GameScreen extends AppCompatActivity {
    Deck d = new Deck();
    DeckLetter l = new DeckLetter();
    int p1score = 0;
    int p2score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen2);
    }


    public void tosplash() {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }


    public int p1click(View view) {
        p1score++;
        Button btn1 = (Button) findViewById(R.id.p1);


        btn1.setText("Player 1: " + String.valueOf(p1score));
        return p1score;
    }


    public int p2click(View view) {
        p2score++;
        Button btn2 = (Button) findViewById(R.id.p2);


        btn2.setText("Player 2: " + String.valueOf(p2score));
        return p2score;
    }


    public void toins(View view) {
        Intent g = new Intent(this, Instructions.class);
        startActivity(g);

    }

    public int getP1score() {
        return p1score;
    }

    public int getP2score() {
        return p2score;
    }

    //sets up the screen by popping from the topic and letter stacks
    public void display() {
        if (!l.isEmpty()) {

            Topic c = d.pop();
            Letter c2 = l.pop();
            ImageView topic = (ImageView) findViewById(R.id.topic);
            ImageView letter = (ImageView) findViewById(R.id.letter);
            TextView topichint = (TextView) findViewById(R.id.topichint);

            c.setPic(topic);
            c2.setPic(letter);
            topichint.setText(c.getCategory());


        } else {
            int p1 = getP1score();

            int p2 = getP2score();

            System.out.println(p1);
            System.out.println(p2);

//displays p1 as victorious when stack is empty
            if (p1 > p2) {

                new AlertDialog.Builder(this)
                        //The title on the Dialog
                        .setTitle("CONGRATULATIONS PLAYER 1!")
                        //The message that will appear
                        .setMessage("Player one has won!" +
                                "\nBetter luck next time player two!")
                        //What to do if the button is pressed
                        .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //do something if they click the button
//otherwise, it just dismisses the dialog
                                tosplash();

                            }
                        }).show();
//displays p2 as victorious when stack is empty
            } else if (p2 > p1) {
                new AlertDialog.Builder(this)
                        //The title on the Dialog
                        .setTitle("CONGRATULATIONS PLAYER 2!")
                        //The message that will appear
                        .setMessage("Player two has won!" +
                                "\nBetter luck next time player one!")
                        //What to do if the button is pressed
                        .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //do something if they click the button
//otherwise, it just dismisses the dialog
                                tosplash();

                            }
                        }).show();

//displays no one as victorious when stack is empty
            } else {
                new AlertDialog.Builder(this)
                        //The title on the Dialog
                        .setTitle("TIE GAME")
                        //The message that will appear
                        .setMessage("You have both tied this game!" +
                                "\nBetter luck next time!")
                        //What to do if the button is pressed
                        .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //do something if they click the button
                                //otherwise, it just dismisses the dialog
                                tosplash();

                            }
                        }).show();

            }

        }
    }

    //updates the screen when new card is needed
    public void pop(View view) {
        display();
    }

    //shuffles each stack in a random order and then puts back in a stack
    public void shuffleClick(View view) {
        d.shuffle();
        l.shuffle();
        display();
    }









}