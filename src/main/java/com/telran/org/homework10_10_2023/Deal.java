package com.telran.org.homework10_10_2023;

import java.util.Scanner;

import static com.telran.org.homework10_10_2023.Deck.*;

public class Deal {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        final int cardsForPlayer = 5;
        int players = 0;


        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) { // game is beginning and shuffle will be next
                    for (int i = 0; i < players * cardsForPlayer; i++) {
                        System.out.println(deck[i]);
                        if (i % cardsForPlayer == cardsForPlayer - 1)
                            System.out.println();
                    }
                }
                break;
            } else {
                if (players == 0) {
                    System.out.println("The game has been terminated.");
                    break;
                } else if (players < 0) {
                    System.out.println("The number of players cannot be less than 0");
                } else {
                    System.out.println("Too many players!");
                }
            }
        } if (false){
            System.out.println("You have not entered a number, or your number is too large!");
        }
//            add card distribution for ("n"-players * 5-cards) from random shuffled deck
//            separate each player wit string empty line
    }

//        // deck initialization
//        public static deckInitialisation() { // 13 cards -clubs, 13 cards -diamonds, 13 cards -hearts, 13 cards -spades
////            I need to give each player the initialized but only 5 cards from this deck
//            String[] deck = new String[numberOfCards];
//            for (int i = 0; i < rank.length; i++) {
//                for (int j = 0; j < suits.length; j++) {
//                    deck[suits.length * i + j] = rank[i] + " " + suits[j];
//                }
//            }


//            // deck shuffling
//        public static deckShuffling() { // method peretasovki kolodi
////                shuffle repeats only with each new game once
//                for (int i = 0; i < numberOfCards; i++) {
//                    int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
//                    String temp = deck[card];
//                    deck[card] = deck[i];
//                    deck[i] = temp;
//                }

//                // the shuffled deck is displayed
////        from shuffled deck, only (n-players)*(5-cards) will be given to all players with 5-cads for each player we have only 52 cards in deck
////        not more than 10 players can play in one game
//                for (int i = 0; i < players * cardsForPlayer; i++) {
//                    System.out.println(deck[i]);
//
//                    if (i % cardsForPlayer == cardsForPlayer - 1)
//                        System.out.println();
//                }
}
