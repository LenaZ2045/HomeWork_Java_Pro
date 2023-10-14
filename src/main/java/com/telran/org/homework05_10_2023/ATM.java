package com.telran.org.homework05_10_2023;

import java.util.Scanner;

public abstract class ATM {
    static Scanner scanner = new Scanner(System.in);


    public static boolean currencyUSD = true;
    public static boolean currencyEUR = false;

    double deposit;
    double withdraw;


    public ATM() {

    }

    public void depositBalanceUSD() {
        System.out.println("enter deposit amount ");
        deposit = scanner.nextDouble();
        System.out.println("your deposit is " + deposit);
    }

    public void withdrawBalanceUSD() {
        System.out.println("enter withdraw amount ");
        withdraw = scanner.nextDouble();
        System.out.println("your withdrawal is " + withdraw);
    }
}
