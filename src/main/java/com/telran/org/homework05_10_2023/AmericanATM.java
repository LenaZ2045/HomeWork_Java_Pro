package com.telran.org.homework05_10_2023;

public class AmericanATM extends ATM implements USDConverter, EURConverter, CADConverter {

    private String name = "American";

    public double balanceUSD = 5000;

    String currency = String.valueOf(Currency.USD);

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public AmericanATM(String americanATM) {
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
    public double convertUSDEUR() { // converts USD to EUR
        return USDConverter.super.convertUSDEUR();
    }

    @Override
    public double convertUSDCAD() { // converts USD to CAD
        return USDConverter.super.convertUSDCAD();
    }

    @Override
    public boolean convertEUR() {
        System.out.println("NO exchange EUR at " + name);
        return false;
    }
}
