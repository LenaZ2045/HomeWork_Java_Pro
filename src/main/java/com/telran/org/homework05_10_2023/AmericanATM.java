package com.telran.org.homework05_10_2023;

public class AmericanATM extends ATM implements Converter{
    private String name = "American";
    public double balanceUSD = 5000;
    String currency = String.valueOf(Currency.USD);
    public AmericanATM() {
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
        System.out.println("balance after withdrawal " + (balanceUSD + deposit - withdraw));

    }

    @Override
    public void convertUSDEUR() {
        Converter.super.convertUSDEUR();
    }

    @Override
    public void convertUSDCAD() {
        Converter.super.convertUSDCAD();
    }
}
