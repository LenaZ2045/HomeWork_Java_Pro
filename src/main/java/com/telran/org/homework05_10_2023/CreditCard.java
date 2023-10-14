package com.telran.org.homework05_10_2023;

import java.util.Scanner;

public class CreditCard extends ATM{
    private String name = "CreditCard";

    private String creditCardNumber = "12345678901122334455";
    private String creditCardPin = "8643";
    private int creditCardBalance = 7000;
    String currency = String.valueOf(Currency.EUR);

    public CreditCard(String creditCard) {
        super();
    }
    public void proveCreditCardNumber() {
        String scanner1 = String.valueOf(new Scanner(System.in));
        System.out.println("enter credit card number ");
        if (scanner1 == creditCardNumber) {
            System.out.println("enter credit card pin ");
            scanner.next();
            if (scanner.next() == creditCardPin) {
                System.out.println("credit card balance " + creditCardBalance);
            } else {
                System.out.println("wrong pin, try again ");
            }
        }
    }

    public CreditCard() {
        super();
    }

    @Override
    public void depositBalanceUSD() {
        System.out.println("Balance at " + name + " = " + creditCardBalance + " " + currency);
        super.depositBalanceUSD();
        System.out.println("balance after deposit " + (creditCardBalance + deposit));
    }

    @Override
    public void withdrawBalanceUSD() {
        System.out.println(name + " available balance " + (creditCardBalance + deposit) + " " + currency);
        super.withdrawBalanceUSD();
        System.out.println("balance after withdrawal " + (creditCardBalance + deposit - withdraw));

    }
}
