package com.telran.org.homework_18_01_2024;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HandlerThreadsApp {

    //THIS CODE BELOW FROM LINES 10-TO-48 DID NOT WORKED QUICKLY IT WAS BUSY... WHY???
//    public static void main(String[] args) throws InterruptedException {
//
//        EventCreator eventCreator = new EventCreator();
//        eventCreator.generateEvents();
//
//        ExecutorService executor = Executors.newFixedThreadPool(4);
//        executor.execute(new FirewallEventListener("Listener1", eventCreator.getSharedEventList()));
//        executor.execute(new FirewallEventListener("Listener2", eventCreator.getSharedEventList()));
//        executor.execute(new FirewallEventListener("Listener3", eventCreator.getSharedEventList()));
//        executor.execute(new FirewallEventListener("Listener4", eventCreator.getSharedEventList()));
//
//        while (!eventCreator.isStopSignalReceived()) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        executor.shutdown();
//        while (!executor.isTerminated()) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        List<String> finalLogList = new ArrayList<>();
//        FirewallEventListener[] listeners = new FirewallEventListener[4];
//        for (FirewallEventListener listener : listeners) {
//            finalLogList.addAll(listener.getLogList());
//        }
//
//        for (String log : finalLogList) {
//            System.out.println(log);
//        }
//    }
//}
    public static void main(String[] args) throws InterruptedException {
        EventCreator eventCreator = new EventCreator();
        eventCreator.generateEvents();

        ExecutorService executor = Executors.newFixedThreadPool(4);
        FirewallEventListener[] listeners = new FirewallEventListener[4];

        for (int i = 0; i < listeners.length; i++) {
            listeners[i] = new FirewallEventListener("Listener" + (i + 1) + " ", eventCreator.getSharedEventList());
            executor.execute(listeners[i]);
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);

        List<String> finalLogList = new ArrayList<>();
        for (FirewallEventListener listener : listeners) {
            finalLogList.addAll(listener.getLogList());
        }

        for (String log : finalLogList) {
            System.out.println(log);
        }
    }
}