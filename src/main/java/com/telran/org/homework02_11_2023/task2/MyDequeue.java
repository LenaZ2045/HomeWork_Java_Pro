package com.telran.org.homework02_11_2023.task2;

public interface MyDequeue {

    void addToHead(Integer element);

    void addToTail(Integer element);

    boolean isEmpty();

    boolean isNotEmpty();

    Integer removeHead();

    Integer removeTail();

    Integer peekHead();

    Integer peekTail();
}