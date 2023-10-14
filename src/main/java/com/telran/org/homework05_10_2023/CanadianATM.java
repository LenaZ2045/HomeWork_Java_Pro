package com.telran.org.homework05_10_2023;

public class CanadianATM extends ATM implements Converter{

    private String name = "Canadian";
    private int balanceUSD = 1000;
    String currency = String.valueOf(Currency.CAD);

    public CanadianATM(String canadianATM) {
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
        System.out.println("balance after withdrawal " + (balanceUSD + deposit - withdraw));
    }

    @Override
    public void convertCAD() {
        Converter.super.convertCAD();
    }
}
