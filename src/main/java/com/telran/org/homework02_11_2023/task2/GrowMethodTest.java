package com.telran.org.homework02_11_2023.task2;

public class GrowMethodTest {

    public static void main(String[] args) {

        MyArrayDequeue myArrayDequeue = new MyArrayDequeue();
        myArrayDequeue.grow(1); // Test Grow Method new capacity = adds to old capacity 2 and adds to new capacity needed 1 ?correct?
        System.out.println(myArrayDequeue);
    }
}
