package com.telran.org.homework_18_01_2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventCreator {

    private List<Event> sharedEventList = new ArrayList<>();
    private boolean stopSignalReceived = false;
    private static String ipPrivate = "192.168.1.1"; // Valid private IP
    private static String ipPublic = "8.8.8.8"; // Valid public IP
    private static String ipInvalid = "256.256.256.256"; // Invalid IP

    public static EventState state1() {
        ipPublic = ipPublic;
        return EventState.SUCCESS;
    }

    public static EventState state2() {
        ipPrivate = ipPrivate;
        return EventState.ACCESS_DENIED;
    }

    public static EventState state3() {
        ipInvalid = ipInvalid;
        return EventState.REQUEST_ERROR;
    }

    public List<Event> generateEvents() {
        List<Event> sharedEventList = new ArrayList<>();
        Event event1 = new Event(1, "Alice", ipPrivate, LocalDate.now(), state2());
        Event event2 = new Event(2, "Bob", ipPublic, LocalDate.now(), state1());
        Event event3 = new Event(3, "Greg", ipInvalid, LocalDate.now(), state3());
        Event event4 = new Event(4, "Donka", ipPublic, LocalDate.now(), state1());
        Event event5 = new Event(5, "Roma", ipPrivate, LocalDate.now(), state2());
        Event event6 = new Event(6, "Chris", ipInvalid, LocalDate.now(), state3());
        Event event7 = new Event(7, "Paul", ipPublic, LocalDate.now(), state1());
        Event event8 = new Event(8, "Ily", ipPrivate, LocalDate.now(), state2());
        Event event9 = new Event(9, "Eric", ipPublic, LocalDate.now(), state1());
        Event event10 = new Event(10, "Felix", ipInvalid, LocalDate.now(), state3());
        sharedEventList.add(event1);
        sharedEventList.add(event2);
        sharedEventList.add(event3);
        sharedEventList.add(event4);
        sharedEventList.add(event5);
        sharedEventList.add(event6);
        sharedEventList.add(event7);
        sharedEventList.add(event8);
        sharedEventList.add(event9);
        sharedEventList.add(event10);
        return sharedEventList;
    }


    public void sendStopSignal() {
        stopSignalReceived = true;
    }

    public List<Event> getSharedEventList() {
        sharedEventList = generateEvents();
        return sharedEventList;
    }

    public boolean isStopSignalReceived() {
        return stopSignalReceived;
    }
}