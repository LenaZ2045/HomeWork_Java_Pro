package com.telran.org.homework_23_01_2024.mysolution;

public class Warehouse {

    public static void main(String[] args) throws InterruptedException {
        Stock stock = new Stock();
        Conveyor conveyor = new Conveyor(stock);
        Loader loader1 = new Loader(stock, 1);
        Loader loader2 = new Loader(stock, 2);
        Loader loader3 = new Loader(stock, 3);
        conveyor.start();
        loader1.start();
        loader2.start();
        loader3.start();
    }
}