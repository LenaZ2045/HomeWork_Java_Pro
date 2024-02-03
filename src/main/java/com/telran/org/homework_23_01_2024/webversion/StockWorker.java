package com.telran.org.homework_23_01_2024.webversion;

public class StockWorker implements Runnable {
    private final int id;
    private final StockHouse warehouse;

    public StockWorker(int id, StockHouse warehouse) {
        this.id = id;
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            try {
                warehouse.getSemaphore().acquire();
                int index = warehouse.getItems().size();
                if (index >= warehouse.getNumWorkers()) {
                    warehouse.getSemaphore().release();
                    continue;
                }
                System.out.printf("Worker %d took item %d.%n", id, index + 1);
                warehouse.getItems().add(index);
                if (index == warehouse.getItems().size() - 1) {
                    System.out.printf("Worker %d filled the warehouse.%n", id);
                    warehouse.getSemaphore().release(warehouse.getNumWorkers() - 1);
                }
                warehouse.getSemaphore().release();
                if (warehouse.getItems().size() == warehouse.getNumWorkers()) {
                    warehouse.getLatch().countDown();
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}