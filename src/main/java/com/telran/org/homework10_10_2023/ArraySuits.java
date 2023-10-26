package com.telran.org.homework10_10_2023;

public interface ArraySuits {

    static Suits[] suit() { // method issues Suits-card name's array
        Suits[] suits = Suits.values(Suits.clubs, Suits.diamonds, Suits.hearts, Suits.spades);
        for (Suits suit : suits) {
            System.out.println(suit);
        }
        return suits;
    }

    @Override
    String toString() // for class method to be changed to string (people can read)
    ;
}
