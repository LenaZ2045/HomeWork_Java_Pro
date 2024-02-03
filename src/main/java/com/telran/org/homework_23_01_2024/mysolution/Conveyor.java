package com.telran.org.homework_23_01_2024.mysolution;

public class Conveyor extends Thread {

    private Stock stock;

    public Conveyor(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        int count = 1;
        synchronized (stock) {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String product = "Product " + count++;
                boolean result = stock.putProduct(product);
                if (!result) {
                    stock.notifyAll();
                    try {
                        stock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Conveyor is busy loading " + product + " into warehouse");
                }
            }
        }
    }
}