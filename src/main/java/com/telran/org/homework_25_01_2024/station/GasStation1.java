package com.telran.org.homework_25_01_2024.station;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GasStation1 {

    private static final LocalTime OPENING_TIME = LocalTime.of(0, 0); // Opening time: 00:00 AM
    private static final LocalTime CLOSING_TIME = LocalTime.of(0, 1); // Closing time: 00:00 PM

    public static void main(String[] args) {
        System.out.println("Start time is : " + OPENING_TIME);

        GasStation gasStation = new GasStation();
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        // Start serving cars (your existing logic)
        while (LocalTime.now().isBefore(CLOSING_TIME)) {
            gasStation.serveCar();
        }

        // Schedule a task to close the gas station after (?) hours
        scheduler.schedule(() -> {
            System.out.println("Gas station closed after (? - hours) my situation is 1 minute.");
            System.out.println("Finish time is : " + CLOSING_TIME);
            // Perform any necessary cleanup or shutdown operations here
            // (e.g., stop serving cars, close files, etc.)
            scheduler.shutdown();
        }, 1, TimeUnit.MINUTES);
    }
}