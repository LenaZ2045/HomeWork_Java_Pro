package com.telran.org.homework02_11_2023.task2;

import java.util.Arrays;

public class MyArrayDequeue implements MyDequeue {

    private static final int DEFAULT_CAPACITY = 10; // if you need to enter number in constructor use the number by capacity
    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int countOfElements;

    public MyArrayDequeue() {
        elements = new Integer[DEFAULT_CAPACITY];
    }

    @Override
    public void addToHead(Integer element) {
        headIndex++;
    }

    @Override
    public void addToTail(Integer element) {
        tailIndex++;
    }

    public void countElements() {
        countOfElements = headIndex + tailIndex;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean isNotEmpty() {
        return true;
    }

    @Override
    public Integer removeHead() {
        headIndex = headIndex - 1;
        return headIndex;
    }

    @Override
    public Integer removeTail() {
        tailIndex = tailIndex - 1;
        return tailIndex;
    }

    @Override
    public Integer peekHead() {
        return null;
    }

    @Override
    public Integer peekTail() {
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayDequeue{" +
                "elements=" + Arrays.toString(elements) +
                ", headIndex=" + headIndex +
                ", tailIndex=" + tailIndex +
                ", countOfElements=" + countOfElements +
                '}';
    }

    // bio directional and method to grow inert array
    public String grow(int needed) {
        //element * 1.5
        // overflow-conscious code
        final int oldCapacity = elements.length;
        int newCapacity;
        // Double capacity if small; else grow by 50%
        int jump = (oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1);
        if (jump < needed
                || (newCapacity = (oldCapacity + jump)) - DEFAULT_CAPACITY > 0)
            newCapacity = newCapacity(needed, jump);
        final Object[] es = elements = Arrays.copyOf(elements, newCapacity);
        // Exceptionally, here tail == head needs to be disambiguated
        if (tailIndex < headIndex || (tailIndex == headIndex && es[headIndex] != null)) {
            // wrap around; slide first leg forward to end of array
            int newSpace = newCapacity - oldCapacity;
            System.arraycopy(es, headIndex,
                    es, headIndex + newSpace,
                    oldCapacity - headIndex);
            for (int i = headIndex, to = (headIndex += newSpace); i < to; i++)
                es[i] = null;
        }
        return null;
    }

    private int newCapacity(int needed, int jump) {
        return needed + jump;
    }
}