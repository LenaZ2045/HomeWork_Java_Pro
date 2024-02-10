package com.telran.org.homework_18_01_2024;

import java.util.ArrayList;
import java.util.List;

public class FirewallEventListener implements Runnable {
    private final String handlerName;
    private final List<Event> sharedEventList;
    private final List<String> logList = new ArrayList<>();

    public FirewallEventListener(String handlerName, List<Event> sharedEventList) {
        this.handlerName = handlerName;
        this.sharedEventList = sharedEventList;
    }

    @Override
    public void run() {
        while (!sharedEventList.isEmpty()) {
            Event event = null;
            synchronized (sharedEventList) {
                if (!sharedEventList.isEmpty()) {
                    event = sharedEventList.remove(0);
                }
            }
            if (event != null) {
                String log1 = "Handler " + handlerName + event.getEventId() + " " + event.getUserName();
                String log2 = "Handler " + handlerName + event.getEventId() + " " + event.getUserIp();
                String log3 = "Handler " + handlerName + event.getEventId() + " " + event.getEventDate();
                String log4 = "Handler " + handlerName + event.getEventId() + " " + event.getEventState();
                logList.add(log1);
                logList.add(log2);
                logList.add(log3);
                logList.add(log4);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<String> getLogList() {
        return logList;
    }
}