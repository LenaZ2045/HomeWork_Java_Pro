package com.telran.org.homework02_11_2023.task2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
    public static void main(String[] args) {

        MyArrayDequeue myArrayDequeue = new MyArrayDequeue();

        for (int i = 0; i < 10; i++) {
            if (myArrayDequeue.isEmpty()) {
                myArrayDequeue.addToHead(0);
            } else {
                myArrayDequeue.addToHead(0);
            }
            myArrayDequeue.countElements();
        }
        System.out.println(myArrayDequeue);
        System.out.println();

        for (int j = 0; j < 12; j++) {
            if (myArrayDequeue.isNotEmpty()) {
                myArrayDequeue.addToTail(1);
            }
            myArrayDequeue.countElements();
        }
        System.out.println(myArrayDequeue);
        System.out.println();

        for (int j = 0; j < 2; j++) {
            myArrayDequeue.removeHead();
        }
        myArrayDequeue.countElements();
        System.out.println(myArrayDequeue);
        System.out.println();

        for (int j = 0; j < 4; j++) {
            myArrayDequeue.removeTail();
        }
        myArrayDequeue.countElements();
        System.out.println(myArrayDequeue);
        System.out.println();

        Deque<Object> element = new ArrayDeque<>(10);
        for (int i = 0; i < 10; i++) {
            element.addFirst(0);
        }
        System.out.println(element);
        System.out.println(element.size());

        for (int j = 0; j < 12; j++) {
            element.addLast(1);
        }
        System.out.println(element);
        System.out.println(element.size());

        for (int i = 0; i < 2; i++) {
            element.removeFirst();
        }
        System.out.println(element);
        System.out.println(element.size());

        for (int j = 0; j < 4; j++) {
            element.removeLast();
        }
        System.out.println(element);
        System.out.println(element.size());
    }
}