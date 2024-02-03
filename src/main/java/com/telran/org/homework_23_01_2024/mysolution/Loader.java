package com.telran.org.homework_23_01_2024.mysolution;

public class Loader extends Thread {

    private Stock stock;

    private int loaderId;

    public Loader(Stock stock, int loaderId) {
        this.stock = stock;
        this.loaderId = loaderId;
    }

    @Override
    public void run() {
        unloadProducts();
    }

    private void unloadProducts() {
        for (int i = 0; i < 10; i++) {
            Integer product = stock.getProduct(i);
            if (product == null) {
                System.out.println("Product at index " + i + " is null.");
            } else {
                System.out.println("Loader " + loaderId + " unloaded product " + product.intValue() + ".");
            }
        }
        System.out.println("Loader " + loaderId + " unloaded all products.");
    }
}