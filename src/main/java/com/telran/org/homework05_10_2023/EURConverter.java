package com.telran.org.homework05_10_2023;

public interface EURConverter {
    String currency = String.valueOf(Currency.EUR);

    default boolean convertEUR() { // exchanges EUR value to USD value
        return true;
    }

    default double convertEURUSD() {
        return ATM.scanner.nextDouble() * 1.05;

    }
}