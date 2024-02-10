package com.telran.org.homework_23_01_2024.webversion;

import java.util.Scanner;

public class StockMain {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the warehouse: ");
        int size = scanner.nextInt();
        System.out.print("Enter the number of workers: ");
        int numWorkers = scanner.nextInt();
        StockHouse warehouse = new StockHouse(size, numWorkers);
        warehouse.start();
    }
}