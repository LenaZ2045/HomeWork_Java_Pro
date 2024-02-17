package com.telran.org.homework_25_01_2024.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringExchangeApp {
    public static void main(String[] args) {
        int numThreads = 10;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Exchanger<String> exchanger = new Exchanger<>();

        for (int i = 0; i < numThreads; i++) {
            executor.execute(new Worker(i, exchanger));
        }

        // Wait for all threads to finish
        executor.shutdown();
    }
}