package com.telran.org.homework10_10_2023;

public enum Suits { // four groups of cards = which are suits / 4 raznix mastei dlya kart
    clubs,
    diamonds,
    hearts,
    spades,
    ;

    @Override
    public String toString() {
        return "Suits{}";
    }

    public static Suits[] values(Suits suits, Suits suits1, Suits suits2, Suits suits3) {
        return new Suits[0];
    }
}

