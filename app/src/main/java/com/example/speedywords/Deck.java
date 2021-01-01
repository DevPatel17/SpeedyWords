package com.example.speedywords;

public class Deck {
    private int count;
    //TO DO: make the length that matches your number of cards
    private Topic data[] = new Topic[27];

    public Deck() {
        shuffle();
    }

    //shuffles the stacks in a random order
    public void shuffle() {
        //An array for each instance variable. A card's pieces
        int picnumber[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
        String category[] = {"animal", "animal", "animal", "city", "city", "city", "country", "country", "country", "famous", "famous", "famous", "food", "food", "food", "movie", "movie", "movie", "name", "name", "name", "object", "object", "object", "plant", "plant", "plant"};

        //Randomizes the order of the arrays
        for (int i = 0; i < 100; i++) {
            int r1 = (int) ((Math.random()) * 27);
            int r2 = (int) ((Math.random()) * 27);

            String temp1 = category[r1];
            category[r1] = category[r2];
            category[r2] = temp1;

            int temp2 = picnumber[r1];
            picnumber[r1] = picnumber[r2];
            picnumber[r2] = temp2;

        }
        count = 0;
        //pushes all (now in random order) into the Deck
        for (int i = 0; i < picnumber.length; i++) {
            Topic c = new Topic(category[i], picnumber[i]);
            push(c);
        }
    }

    public void push(Topic addMe) {
        data[count] = addMe;
        count++;
    }

    public Topic pop() {
        count--;
        return data[count];
    }

}
