package com.example.speedywords;

import android.widget.ImageView;

public class Letter {
    private int picnum;

    public Letter(int n) {
        picnum = n;
    }

    //sets the letter picture based on picnum (called in dispay())
    public void setPic(ImageView picture) {

        if (picnum == 1)
            picture.setImageResource(R.drawable.p22);
        else if (picnum == 2)
            picture.setImageResource(R.drawable.p1);
        else if (picnum == 3)
            picture.setImageResource(R.drawable.p2);
        else if (picnum == 4)
            picture.setImageResource(R.drawable.p3);
        else if (picnum == 5)
            picture.setImageResource(R.drawable.p4);
        else if (picnum == 6)
            picture.setImageResource(R.drawable.p5);
        else if (picnum == 7)
            picture.setImageResource(R.drawable.p6);
        else if (picnum == 8)
            picture.setImageResource(R.drawable.p7);
        else if (picnum == 9)
            picture.setImageResource(R.drawable.p8);
        else if (picnum == 10)
            picture.setImageResource(R.drawable.p9);
        else if (picnum == 11)
            picture.setImageResource(R.drawable.p10);
        else if (picnum == 12)
            picture.setImageResource(R.drawable.p11);
        else if (picnum == 13)
            picture.setImageResource(R.drawable.p12);
        else if (picnum == 14)
            picture.setImageResource(R.drawable.p13);
        else if (picnum == 15)
            picture.setImageResource(R.drawable.p14);
        else if (picnum == 16)
            picture.setImageResource(R.drawable.p15);
        else if (picnum == 17)
            picture.setImageResource(R.drawable.p16);
        else if (picnum == 18)
            picture.setImageResource(R.drawable.p17);
        else if (picnum == 19)
            picture.setImageResource(R.drawable.p18);
        else if (picnum == 20)
            picture.setImageResource(R.drawable.p19);
        else if (picnum == 21)
            picture.setImageResource(R.drawable.p20);
        else if (picnum == 22)
            picture.setImageResource(R.drawable.p21);


    }
}
