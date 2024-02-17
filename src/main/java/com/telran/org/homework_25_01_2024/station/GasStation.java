package com.telran.org.homework_25_01_2024.station;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class GasStation {

    private static final int NUM_COLUMNS = 4;
    private static final int MAX_MINUTES = 0; // Максимальное время работы в минутах

    private final Semaphore columns;

    public GasStation() {
        columns = new Semaphore(NUM_COLUMNS);
    }

    public void serveCar() {
        try {
            columns.acquire(); // Занимаем одну из колонок
            System.out.println("Car is being served at column " + Thread.currentThread().getId());
            TimeUnit.MINUTES.sleep(MAX_MINUTES); // Имитируем обслуживание
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            columns.release(); // Освобождаем колонку
            System.out.println("Car finished at column " + Thread.currentThread().getId());
        }
    }
}