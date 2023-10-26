package com.telran.org.homework10_10_2023;

import java.util.Arrays;
import java.util.Random;

public abstract class Deck {
    static Random random = new Random(); // shuffles only random cards / Random cards will be applied to players
    static int numberOfCards;
    static String rank = Arrays.toString(ArrayRank.rank());
    static String suits = (ArraySuits.suit().toString());
    static String[] deck;

    public Deck(Suits[] suits, Rank[] rank) {
    }

    public int numberOfCards() { // multiplying suits and ranks length gives us number of cards in one deck
        int deck = (ArraySuits.suit().length * ArrayRank.rank().length);

        return deck;
    }

    @Override
    public String toString() {
        return "Deck{}";
    }

    // deck initialization
    public void deckInitialisation() { // 13 cards -clubs, 13 cards -diamonds, 13 cards -hearts, 13 cards -spades
//            I need to give each player the initialized but only 5 cards from this deck
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length(); i++) {
            for (int j = 0; j < suits.length(); j++) {
                deck[suits.length() * i + j] = (ArrayRank.rank()[i]) + " " + (ArraySuits.suit()[j]);
            }
        }
    }

    // deck shuffling
    public static void deckShuffling() { // method peretasovki kolodi
//                shuffle repeats only with each new game once
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }
}
