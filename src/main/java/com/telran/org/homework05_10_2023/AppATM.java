package com.telran.org.homework05_10_2023;

import java.util.Scanner;

public class AppATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmericanATM americanATM = new AmericanATM();
        CanadianATM canadianATM = new CanadianATM("canadianATM");
        CreditCard creditCard = new CreditCard("creditCard");
        EuropeanATM europeanATM = new EuropeanATM();

        System.out.println("enter your currency: ");
        String s = scanner.nextLine().toUpperCase();
        Currency input = Currency.valueOf(s);
        switch (input) {
            case EUR, USD, CAD:
                System.out.println(s);
                break;
        }
        String mainCardNumber = "1111222233334444";
        String mainCardPin = "1234";
        double mainCardBalance = 500;
        String mainCardValue = "EUR";

        americanATM.depositBalanceUSD();
        canadianATM.depositBalanceUSD();
        creditCard.depositBalanceUSD();
        europeanATM.depositBalanceUSD();

        americanATM.withdrawBalanceUSD();
        canadianATM.withdrawBalanceUSD();
        creditCard.withdrawBalanceUSD();
        europeanATM.withdrawBalanceUSD();

        System.out.println(findConvert());


    }

    public static boolean findConvert() {
        AmericanATM americanATM = new AmericanATM();
        CanadianATM canadianATM = new CanadianATM("canadianATM");
        CreditCard creditCard = new CreditCard("creditCard");
        EuropeanATM europeanATM = new EuropeanATM();
        ATM[] atmsConvert = {americanATM, canadianATM, creditCard, europeanATM};
            for (ATM atm : atmsConvert) {
                if (ATM.currencyUSD) {
                    System.out.println("does not converts to EUR! " + atm);
                }
                if (ATM.currencyEUR) {
                    System.out.println("converts to EUR! " + atm);
                }
            }
        return true;
    }

}
