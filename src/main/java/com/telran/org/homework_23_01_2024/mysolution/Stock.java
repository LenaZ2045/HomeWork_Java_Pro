package com.telran.org.homework_23_01_2024.mysolution;

public class Stock extends Thread {

    private String[] stockSize;

    private int currentIndex;

    public Stock() {
        stockSize = new String[10];
        currentIndex = 0;
    }

    public boolean putProduct(String product) {
        if (currentIndex == stockSize.length) {
            System.out.println("Stock is loaded! ");
            currentIndex = 0;
            return false;
        }
        stockSize[currentIndex] = product;
        currentIndex++;
        return true;
    }

    public Integer getProduct(int index) {
        if (currentIndex == stockSize.length) {
            System.out.println("Stock is emptied! ");
            currentIndex = 0;
            return null;
        }
        String productString = stockSize[currentIndex];
        if (productString == null) {
            return null;
        }
        Integer product;
        try {
            product = Integer.parseInt(productString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid product: " + productString);
            return null;
        }
        synchronized (this) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stockSize[currentIndex] = null;
        currentIndex++;
        return product;
    }
}