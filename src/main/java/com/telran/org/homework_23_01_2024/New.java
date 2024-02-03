package com.telran.org.homework_23_01_2024;

import java.util.Scanner;

public class New {

    public static class Warehouse {
        private int numWorkers;
        private int numCells;
        private int[] stock;

        public Warehouse(int numWorkers, int numCells) {
            this.numWorkers = numWorkers;
            this.numCells = numCells;
            this.stock = new int[numCells];
        }

        public void unloadProducts() {
            for (int i = 0; i < numCells; i++) {
                int product = stock[i];
                System.out.println("Loader " + i % numWorkers + " unloaded product " + product + ".");
            }
            System.out.println("All products have been unloaded.");
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of unloading workers: ");
            numWorkers = scanner.nextInt();
            System.out.print("Enter the number of products in the stock: ");
            numCells = scanner.nextInt();
            stock = new int[numCells];
            for (int i = 0; i < numCells; i++) {
                stock[i] = i + 1;
            }
            Thread[] workers = new Thread[numWorkers];
            for (int i = 0; i < numWorkers; i++) {
                workers[i] = new Thread(new Worker(i));
                workers[i].start();
            }
            for (int i = 0; i < numWorkers; i++) {
                try {
                    workers[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            unloadProducts();
        }

        private class Worker implements Runnable {
            private int id;

            public Worker(int id) {
                this.id = id;
            }

            public void run() {
                for (int i = id; i < numCells; i += numWorkers) {
                    int product = stock[i];
                    System.out.println("Worker " + id + " took product " + product + ".");
                }
            }
        }

        public static void main(String[] args) {
            Warehouse warehouse = new Warehouse(0, 0);
            warehouse.run();
        }
    }
}