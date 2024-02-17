package com.telran.org.homework_25_01_2024.exchanger;

import java.util.concurrent.Exchanger;

public class Worker implements Runnable {
    private final int id;
    private final Exchanger<String> exchanger;

    public Worker(int id, Exchanger<String> exchanger) {
        this.id = id;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            String messageBefore = "Thread " + id + ": Before exchange";
            System.out.println(messageBefore);

            // Wait for other thread to exchange
            String exchangedMessage = exchanger.exchange(messageBefore);

            String messageAfter = "Thread " + id + ": After exchange with " + exchangedMessage;
            System.out.println(messageAfter);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}