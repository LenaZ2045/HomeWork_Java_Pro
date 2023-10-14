package com.telran.org.homework05_10_2023;

public interface Converter {

    default void convertEUR() {
        System.out.println("convert EUR to USD $" + ATM.scanner.nextDouble() * 1.05);
    }

    default void convertCAD() {
        System.out.println("convert CAD to USD $" + ATM.scanner.nextDouble() * 0.73);
    }

    default void convertUSDEUR() {
        System.out.println("convert USD to EUR " + ATM.scanner.nextDouble() * 0.95);
    }

    default void convertUSDCAD() {
        System.out.println("convert USD to CAD " + ATM.scanner.nextDouble() * 1.37);
    }
}