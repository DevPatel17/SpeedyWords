package com.example.speedywords;

import android.widget.ImageView;

public class Topic {
    private String category;
    private int picnum;


    public Topic(String c, int l) {
        category = c;
        picnum = l;

    }

    public String getCategory() {

        return category;
    }


    //sets the topic picture based on picnum (called in dispay())
    public void setPic(ImageView picture) {


        if (picnum == 1)
            picture.setImageResource(R.drawable.animalblue);
        else if (picnum == 2)
            picture.setImageResource(R.drawable.animalgreen);
        else if (picnum == 3)
            picture.setImageResource(R.drawable.animalorange);


        else if (picnum == 4)
            picture.setImageResource(R.drawable.cityblue);
        else if (picnum == 5)
            picture.setImageResource(R.drawable.citygreen);
        else if (picnum == 6)
            picture.setImageResource(R.drawable.cityorange);


        else if (picnum == 7)
            picture.setImageResource(R.drawable.countryblue);
        else if (picnum == 8)
            picture.setImageResource(R.drawable.countrygreen);
        else if (picnum == 9)
            picture.setImageResource(R.drawable.countryorange);


        else if (picnum == 10)
            picture.setImageResource(R.drawable.famousblue);
        else if (picnum == 11)
            picture.setImageResource(R.drawable.famousgreen);
        else if (picnum == 12)
            picture.setImageResource(R.drawable.famousorange);


        else if (picnum == 13)
            picture.setImageResource(R.drawable.foodblue);
        else if (picnum == 14)
            picture.setImageResource(R.drawable.foodgreen);
        else if (picnum == 15)
            picture.setImageResource(R.drawable.foodorange);


        else if (picnum == 17)
            picture.setImageResource(R.drawable.moviegblue);
        else if (picnum == 18)
            picture.setImageResource(R.drawable.moviegreen);
        else if (picnum == 19)
            picture.setImageResource(R.drawable.movieorange);


        else if (picnum == 20)
            picture.setImageResource(R.drawable.nameblue);
        else if (picnum == 21)
            picture.setImageResource(R.drawable.namegreen);
        else if (picnum == 22)
            picture.setImageResource(R.drawable.nameorange);


        else if (picnum == 23)
            picture.setImageResource(R.drawable.objectblue);
        else if (picnum == 24)
            picture.setImageResource(R.drawable.objectgreen);
        else if (picnum == 25)
            picture.setImageResource(R.drawable.objectorange);


        else if (picnum == 26)
            picture.setImageResource(R.drawable.plantblue);
        else if (picnum == 27)
            picture.setImageResource(R.drawable.plantgreen);
        else if (picnum == 28)
            picture.setImageResource(R.drawable.plantorange);


    }
}

