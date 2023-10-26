package com.telran.org.homework10_10_2023;

public class Card extends Deck implements ArrayRank, ArraySuits {
    public Card(Suits[] suits, Rank[] rank) {
        super(suits, rank);
    }
    //    how many cards in one shuffle

    @Override
    public int numberOfCards() {
        return super.numberOfCards();
    }

    @Override
    public String toString() {
        return "Card{}";
    }
}

