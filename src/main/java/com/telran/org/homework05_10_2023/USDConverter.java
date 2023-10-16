package com.telran.org.homework05_10_2023;

public interface USDConverter {

//    String currencyUS = String.valueOf(Currency.USD);
//    String currencyCA = String.valueOf(Currency.CAD);
//    String currencyEU = String.valueOf(Currency.EUR);

    default double convertUSDEUR() { // exchanges USD to EUR
        return ATM.scanner.nextDouble() * 0.95;
    }

    default double convertUSDCAD() { // exchanges EUR to CAD
        return ATM.scanner.nextDouble() * 1.37;
    }
}
