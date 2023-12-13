package com.telran.org.homework10_10_2023;

import java.awt.*;
import java.util.Scanner;
public class Deal {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int cardsForPlayer = 5;
        int players = 0;

        Deck deck = new Deck();
        deck.initialization();
        deck.shuffling();

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= deck.numberOfCards()) {
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
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        Player[] ourPlayers = new Player[players];
        int indexDeck = 0;
        Card[] shuffleDeck = deck.getDeck();
        for (int i = 0; i < players; i++) {
            Player player = new Player(cardsForPlayer);
            Card[] cards = player.getCards();
            for (int j = 0; j < cardsForPlayer; j++) {
                Card card = shuffleDeck[indexDeck];
                cards[j] = card;
                indexDeck++; // 0 - 4; 5 - 9 ....
            }
            ourPlayers[i] = player;
        }

        // Output
        for (Player player : ourPlayers) {
            System.out.println("Card for player :");
            for (Card card : player.getCards()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}