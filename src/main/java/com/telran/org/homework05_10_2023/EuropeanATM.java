package com.telran.org.homework05_10_2023;

public class EuropeanATM extends ATM implements EURConverter {
    private String name = "European";
    private double balanceUSD = 2500;
    public String currency = String.valueOf(Currency.EUR);

//    double europeanTransactionBalance = balanceUSD - convertEURUSD();

    public EuropeanATM(String name, String currency) {
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
        System.out.println("you are authorized at " + name);
        System.out.println(name + " available balance " + balanceUSD + deposit + " " + currency);
        System.out.println("enter withdrawal sum in EUR");
        System.out.println("balance after withdraw in USD " + (balanceUSD - (convertEURUSD())));
        if (withdraw > balanceUSD) {
            System.out.println("withdraw amount NOT available");
        } else {

        }
        return 0;
    }

    public boolean convertEUR() {// converts EUR to USD
        System.out.println("YES exchange EUR at " + name);
        return EURConverter.super.convertEUR();
    }

    @Override
    public double convertEURUSD() {
        return EURConverter.super.convertEURUSD();
    }
}