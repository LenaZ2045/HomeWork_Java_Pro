package com.telran.org.homework_25_01_2024.station;

import com.telran.org.homework_25_01_2024.station.GasStation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GasStationThread {
public static void main(String[] args) throws Exception {
        GasStation gasStation = new GasStation();
        ExecutorService executor = Executors.newFixedThreadPool(TimeUnit.MINUTES.ordinal());

        // Создаем бесконечный поток машин
        while (true) {
            executor.execute(gasStation::serveCar);
        }
    }
}