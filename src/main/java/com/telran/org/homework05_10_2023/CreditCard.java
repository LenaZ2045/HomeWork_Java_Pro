package com.telran.org.homework05_10_2023;

public class CreditCard extends ATM implements EURConverter, CADConverter, USDConverter {
    private String name = "CreditCard";

    private String creditCardNumber = "1234567890112233";

    private String creditCardPin = "8643";

    private int creditCardBalance = 7000;

//    String currency = String.valueOf(Currency.EUR);

    public CreditCard(String name, String currency) {
    }

    public boolean proveCreditCardNumber() {
        System.out.println("enter credit card number ");
        scanner.next(creditCardNumber);
        System.out.println("enter credit card pin ");
        scanner.next(creditCardPin);
        System.out.println("you are authorized at " + name);
        return true;
    }

    public CreditCard() {
        super();
    }

    @Override
    public void depositBalanceUSD() {
        super.depositBalanceUSD();
        System.out.println("balance after deposit " + (creditCardBalance + deposit));
    }

    @Override
    public double withdrawBalanceUSD() {
        super.withdrawBalanceUSD();
        System.out.println("balance after withdrawal " + (creditCardBalance + deposit - withdraw));

        return 0;
    }

    @Override
    public boolean convertEUR() {
        System.out.println("YES exchange EUR at " + name);
        return EURConverter.super.convertEUR();
    }
}
