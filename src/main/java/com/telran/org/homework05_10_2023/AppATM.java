package com.telran.org.homework05_10_2023;

import java.util.Scanner;

import static com.telran.org.homework05_10_2023.ATM.scanner;

public class AppATM {

    public static void main(String[] args) { // we are creating static methods if it is in public static void main(String[] args)

        Scanner scanner = new Scanner(System.in);

        AmericanATM americanATM = new AmericanATM("americanATM");
        CanadianATM canadianATM = new CanadianATM("canadianATM", CADConverter.currency);
        CreditCard creditCard = new CreditCard("creditCard", EURConverter.currency);
        EuropeanATM europeanATM = new EuropeanATM("europeanATM", EURConverter.currency);

        creditCard.depositBalanceUSD();
        System.out.println();
        creditCard.withdrawBalanceUSD();
        System.out.println();

        System.out.println("enter your currency: ");
        String s = scanner.nextLine().toUpperCase();
        Currency input = Currency.valueOf(s);
        switch (input) {
            case EUR, USD, CAD:
                System.out.println(s);
                break;
        }
        System.out.println();

        findEURConvert();

//        System.out.println("Balance after transaction " + europeanATM.europeanTransactionBalance); // - did not worked correctly
        System.out.println();
        System.out.println("Will you please explain this homework in the beginning of our next class, please?");
    }

    public static Object findEURConvert() {
        AmericanATM americanATM = new AmericanATM("americanATM");
        CanadianATM canadianATM = new CanadianATM("canadianATM", CADConverter.currency);
        CreditCard creditCard = new CreditCard("creditCard", EURConverter.currency);
        EuropeanATM europeanATM = new EuropeanATM("europeanATM", EURConverter.currency);
        EURConverter[] converters = {americanATM, canadianATM, creditCard, europeanATM};
        for (EURConverter convertible : converters) {
            if (convertible.convertEUR()) {
            }
        }
        String mainCardNumber = "1111222233334444";
        String mainCardPin = "1234";
        double mainCardBalance = 500.50;
        String mainCardCurrency = String.valueOf((Currency.EUR));
        System.out.println();
        System.out.println("enter your card number for EUR exchange ");
        scanner.next(mainCardNumber);
        System.out.println("enter this card pin ");
        scanner.next(mainCardPin);
        europeanATM.withdrawBalanceUSD();
        return 0;
    }
}
