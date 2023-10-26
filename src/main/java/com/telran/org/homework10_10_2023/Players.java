package com.telran.org.homework10_10_2023;

import com.telran.org.homework10_10_2023.*;

public class Players extends Deck implements ArraySuits, ArrayRank {
//    Object players = sc.nextInt();

    public Players(Suits[] suits, Rank[] rank) { // constructor
//         random 5 cards by number of players / each player should only get 5 cards
//        Each player should be separated with empty string/line
        super(suits, rank);
    }

    // the shuffled deck is displayed
//        from shuffled deck, only (n-players)*(5-cards) will be given to all players with 5-cads for each player we have only 52 cards in deck
//        not more than 10 players can play in one game
//    public static displayShuffle() {
//        for (int i = 0; i < players * cardsForPlayer; i++) {
//            System.out.println(deck[i]);
//
//            if (i % cardsForPlayer == cardsForPlayer - 1)
//                System.out.println();
//        }
//    }


    @Override
    public int numberOfCards() { // method
        return super.numberOfCards();
    }

    @Override
    public String toString() { // method
        return super.toString();
    }
}
