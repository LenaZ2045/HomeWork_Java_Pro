package com.telran.org.homework02_11_2023.task1;

import com.telran.org.homework10_10_2023.Deck;

import java.util.*;

public class SolitaireGame {
    private static Random random = new Random(); // shuffles only random cards / Random cards will be displayed
    private static String[] deck;

    private static Suits suits;
    private static Rank rank;

    public SolitaireGame(Suits suits, Rank rank) {
        this.suits = suits;
        this.rank = rank;
    }

    public static void setDeck(List<String> deck) {
        SolitaireGame.deck = deck.toArray(new String[104]);
    }

    public static void main(String[] args) {

        List<String> solitaireRank = new ArrayList<>();
        solitaireRank.add(String.valueOf(Rank.ACE));// need to create array with all cards in deck
        solitaireRank.add(String.valueOf(Rank.TWO));
        solitaireRank.add(String.valueOf(Rank.THREE));
        solitaireRank.add(String.valueOf(Rank.FOUR));
        solitaireRank.add(String.valueOf(Rank.FIVE));
        solitaireRank.add(String.valueOf(Rank.SIX));
        solitaireRank.add(String.valueOf(Rank.SEVEN));
        solitaireRank.add(String.valueOf(Rank.EIGHT));
        solitaireRank.add(String.valueOf(Rank.NINE));
        solitaireRank.add(String.valueOf(Rank.TEN));
        solitaireRank.add(String.valueOf(Rank.JACK));
        solitaireRank.add(String.valueOf(Rank.QUEEN));
        solitaireRank.add(String.valueOf(Rank.KING));

        List<String> solitaireSuits = new ArrayList<>();
        solitaireSuits.add(String.valueOf(Suits.CLUBS));
        solitaireSuits.add(String.valueOf(Suits.HEARTS));
        solitaireSuits.add(String.valueOf(Suits.DIAMONDS));
        solitaireSuits.add(String.valueOf(Suits.SPADES));

        System.out.println(solitaireRank);
        System.out.println(solitaireSuits);
        System.out.println();

        Deck deck1 = new Deck();
        deck1.initialization();
        System.out.println(Arrays.toString(deck1.getDeck()));

        setDeck(solitaireSuits);
        setDeck(solitaireRank);
        List<String> deckCards = Collections.singletonList(String.valueOf(numberOfCards1(solitaireRank, solitaireSuits)));
        String[] deck2 = numberOfCards();
        for (String card : deckCards) {
            System.out.println("Count cards in the deck = " + card);
            for (String solitaireCards : deck2)
// WHY DO I GET SOME 'NULL' MEANINGS ?
                System.out.println("List cards in the deck " + solitaireCards);
            System.out.println();
        }
// I DO NOT UNDERSTAND WHAT MY METHOD DOES AND HOW IT WORKS ?
        List<String> stringList = List.of(Arrays.toString(numberOfCards()));
        System.out.println(stringList);

    }

    public static String[] numberOfCards() { // multiplying suits and ranks length gives us number of cards in one deck
        int deck1 = 0;
        for (int i = 0; i < deck1; i++) {
// I DO NOT SEE THAT MY RANDOM IS WORKING PROPERLY
            int card = i + (random.nextInt(deck1 - 104)); // random cards in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public static int numberOfCards1(List<String> solitaireRank, List<String> solitaireSuits) { // multiplying suits and ranks length gives us number of cards in one deck
        int numberOfCards = (solitaireRank.size() * solitaireSuits.size());
        return numberOfCards;
    }
}