package com.telran.org.homework05_10_2023;

public interface CADConverter {

    String currency = String.valueOf(Currency.CAD);

    default double convertCAD() { // exchanges CAD to USD
        return ATM.scanner.nextDouble() * 0.75;
    }

}
