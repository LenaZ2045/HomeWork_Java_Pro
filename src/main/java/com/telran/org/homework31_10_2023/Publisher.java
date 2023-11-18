package com.telran.org.homework31_10_2023;

public class Publisher {

    String publisherName;
    int publisherFoundationYear;

    public Publisher(String publisherName, int publisherFoundationYear) {
        this.publisherName = publisherName;
        this.publisherFoundationYear = publisherFoundationYear;
    }

    public int getPublisherFoundationYear() {
        return publisherFoundationYear;
    }

    @Override
    public String toString() {
        return "Publisher{" + "publisherName=" + publisherName + ", publisherFoundationYear=" + publisherFoundationYear + '}';
    }
}
