package com.telran.org.homework_18_01_2024;

import java.time.LocalDate;
import java.util.Arrays;

public class Event {
    private final int eventId;
    private final String userName;
    private final String userIp;
    private final LocalDate eventDate;
    private final EventState eventState;

    public Event(int eventId, String userName, String userIp, LocalDate eventDate, EventState eventState) {
        this.eventId = eventId;
        this.userName = userName;
        this.userIp = userIp;
        this.eventDate = eventDate;
        this.eventState = eventState;
    }

    public int getEventId() {
        return eventId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserIp() {
        return userIp;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public EventState getEventState() {
        return eventState;
    }
    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", userName='" + userName + '\'' +
                ", userIp='" + userIp + '\'' +
                ", eventDate=" + eventDate +
                ", eventState=" + Arrays.toString(new EventState[]{eventState}) +
                '}';
    }
}