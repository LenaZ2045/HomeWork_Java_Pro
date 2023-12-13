package com.telran.org.homework10_10_2023;

import java.util.Random;

public class Deck {

    private Card[] deck;

    public Deck() {
        // empty constructor
    }

    public Card[] getDeck() {
        return deck;
    }

    public int numberOfCards() { // multiplication of suits and ranks length gives us number of cards in one deck
        return deck.length;
    }

    public void shuffling() {
        int numberOfCards = Suits.values().length * Rank.values().length;
        Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int index = i + (random.nextInt(numberOfCards - i)); // shuffles random cards in the deck
            Card temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }

    // deck initialization
    public void initialization() { // 13 club cards, 13 diamond cards, 13 heart cards, 13 spades cards (52 total cards in one deck)
//            I need to give each player the initialized but only 5 cards from this deck
        int numberOfCards = Suits.values().length * Rank.values().length;
        deck = new Card[numberOfCards];
        int index = 0;
        for (Suits suit : Suits.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                deck[index] = card;
                index++;
            }
        }
    }
}