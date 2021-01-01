package com.example.speedywords;

public class DeckLetter {
    private int count;
    //TO DO: make the length that matches your number of cards
    private Letter data[] = new Letter[27];

    public DeckLetter() {
        shuffle();
    }

    public void shuffle() {
        //an array for each instance variable. A card's pieces
        int lpicnumber[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
        //Randomizes the order of the arrays
        for (int i = 0; i < 100; i++) {
            int r2 = (int) ((Math.random()) * lpicnumber.length);
            int r1 = (int) ((Math.random()) * lpicnumber.length);
            //swaps each array

            int temp3 = lpicnumber[r1];
            lpicnumber[r1] = lpicnumber[r2];
            lpicnumber[r2] = temp3;

        }

        count = 0;
        //pushes all (now in random order) into the Deck
        for (int i = 0; i < lpicnumber.length; i++) {
            Letter c2 = new Letter(lpicnumber[i]);
            push(c2);
        }
    }

    public void push(Letter addMe) {
        data[count] = addMe;
        count++;
    }

    public Letter pop() {
        count--;
        return data[count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
