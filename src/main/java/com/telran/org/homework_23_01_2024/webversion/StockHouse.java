package com.telran.org.homework_23_01_2024.webversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class StockHouse {
    private final List<Integer> items;
    private final Semaphore semaphore;
    private final CountDownLatch latch;
    private final int numWorkers;

    public StockHouse(int size, int numWorkers) {
        this.items = new ArrayList<>(size);
        this.semaphore = new Semaphore(size);
        this.latch = new CountDownLatch(numWorkers);
        this.numWorkers = numWorkers;
    }

    public void start() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of workers: ");
        int numWorkers = scanner.nextInt();
        for (int i = 0; i < numWorkers; i++) {
            new Thread(new StockWorker(i, this)).start();
        }
        latch.await();
        items.clear();
        System.out.println("Warehouse cleared.");
    }


    public int getNumWorkers() {
        return numWorkers;
    }

    public List<Integer> getItems() {
        return items;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}