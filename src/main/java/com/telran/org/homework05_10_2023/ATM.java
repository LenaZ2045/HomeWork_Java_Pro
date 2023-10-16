package com.telran.org.homework05_10_2023;

import java.util.Scanner;

public abstract class ATM {

    static Scanner scanner = new Scanner(System.in);

    int deposit;

    int withdraw;

    public ATM() {
    }

    public void depositBalanceUSD() {
        CreditCard creditCard = new CreditCard();
        creditCard.proveCreditCardNumber();
        System.out.println("enter deposit amount ");
        deposit = (int) scanner.nextDouble();
        System.out.println("your deposit is " + deposit);
    }

    public double withdrawBalanceUSD() {
        CreditCard creditCard = new CreditCard();
        creditCard.proveCreditCardNumber();
        System.out.println("enter withdraw amount ");
        withdraw = (int) scanner.nextDouble();
        System.out.println("your withdrawal is " + withdraw);
        return 0;
    }
}
