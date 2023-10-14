package com.telran.org.homework05_10_2023;

public class EuropeanATM extends ATM implements Converter {
    private String name = "European";
    private double balanceUSD = 2500;

    String currency = String.valueOf(Currency.EUR);


    public EuropeanATM() {
        super();
    }


    @Override
    public void depositBalanceUSD() {
        System.out.println("Balance at " + name + " = " + balanceUSD + " " + currency);
        super.depositBalanceUSD();
        System.out.println("balance after deposit " + (balanceUSD + deposit));
    }

    @Override
    public void withdrawBalanceUSD() {
        System.out.println(name + " available balance " + (balanceUSD + deposit) + " " + currency);
        super.withdrawBalanceUSD();
        System.out.println("balance after withdrawal "+ (balanceUSD + deposit - withdraw));

    }

    @Override
    public void convertEUR() {
        Converter.super.convertEUR();
    }
}