package com.telran.org.homework16_11_2023.book_lambda;

public class Publisher {

    String publisherName;
    int publisherFoundationYear;

    public Publisher(String publisherName, int publisherFoundationYear) {
        this.publisherName = publisherName;
        this.publisherFoundationYear = publisherFoundationYear;
    }

    @Override
    public String toString() {
        return "Publisher{" + "publisherName=" + publisherName + ", publisherFoundationYear=" + publisherFoundationYear + '}';
    }

    public <T> Comparable<T> getPublisher() {
        return (Comparable<T>) publisherName;
    }
}
