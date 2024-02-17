package com.telran.org.homework_25_01_2024.station;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GasStationThread {
    public static void main(String[] args) throws Exception {
        GasStation gasStation = new GasStation();
        ExecutorService executor = Executors.newFixedThreadPool(TimeUnit.MINUTES.ordinal());

        // Создаем бесконечный поток машин

        while (true) {
            try {
                executor.execute(gasStation::serveCar);
            } catch (Exception e) {
                // Handle the exception (e.g., log it, perform cleanup, etc.)
                System.err.println("Exception occurred: " + e.getMessage());
                break; // Exit the loop
            }
        }
    }
}