package com.telran.org.homework10_10_2023;

 public class Player {

        private final Card[] cards;

        public Player(int numberOfCards) { // generated constructor
            this.cards = new Card[numberOfCards];
        }

        public Card[] getCards() { // generated getter
            return cards;
        }
}
