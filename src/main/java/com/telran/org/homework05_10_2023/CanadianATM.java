package com.telran.org.homework05_10_2023;

public class CanadianATM extends ATM implements CADConverter, EURConverter, USDConverter {

    private String name = "Canadian";

    private int balanceUSD = 1000;

    String currency = String.valueOf(Currency.CAD);

    public CanadianATM(String name, String currency) {
        super();
    }

    @Override
    public void depositBalanceUSD() {
        System.out.println("Balance at " + name + " = " + balanceUSD + " " + currency);
        super.depositBalanceUSD();
        System.out.println("balance after deposit " + (balanceUSD + deposit));
    }

    @Override
    public double withdrawBalanceUSD() {
        System.out.println(name + " available balance " + (balanceUSD + deposit) + " " + currency);
        super.withdrawBalanceUSD();
        System.out.println("balance after withdrawal " + (balanceUSD + deposit - withdraw));
        return 0;
    }

    @Override
    public double convertCAD() { // converts CAD to USD
        return CADConverter.super.convertCAD();
    }

    @Override
    public boolean convertEUR() {
        System.out.println("NO exchange EUR at " + name);
        return false;
    }
}
