package com.telran.org.homework02_11_2023.task1;

import com.telran.org.homework10_10_2023.Deck;

import java.util.*;
import java.util.function.Consumer;

public class SolitaireGame {
    public static void main(String[] args) {

        List<String> solitaireRank = new ArrayList<>();
        if (solitaireRank.isEmpty()) {
            solitaireRank.add(Arrays.toString(Rank.values()));
        }
        System.out.println(solitaireRank);
        System.out.println(Rank.values().length);
        System.out.println();

        List<String> solitaireSuits = new ArrayList<>();
        if (solitaireSuits.isEmpty()) {
            solitaireSuits.add(Arrays.toString(Suits.values()));
        }
        System.out.println(solitaireSuits);
        System.out.println(Suits.values().length);
        System.out.println();

        int num = Suits.values().length * Rank.values().length;
        System.out.println("Total cards in the deck = " + num);
        System.out.println();

        Deck deck = new Deck();
        deck.initialization();
        System.out.println("Initialized cards in the deck by order");
        System.out.println(Arrays.toString(deck.getDeck()));
        System.out.println();
        deck.shuffling();
        System.out.println(Arrays.toString(deck.getDeck()));


        for (int i = 0; i < deck.getDeck().length; i++) {
            // if array deck.getDeck() has SAME suits STANDING next to each other
            // remove ONE of the similar PAIR suits
            // that stand next to each other
            int i1 = 0;
            if (Arrays.toString(deck.getDeck()).equals(Arrays.toString(deck.getDeck()))) {
                i1 = deck.numberOfCards() / 4;
            }
            System.out.println(i1);

        }
        System.out.println();
        System.out.println(Arrays.toString(deck.getDeck()));
    }
}