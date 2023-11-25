package com.telran.org.homework19_10_2023;

import java.util.Iterator;

public class CustomIterator implements Iterator {

    private int[] integers;
    private int position;

    private int currentPosition;

    public CustomIterator(int integers) {
        this.integers = new int[]{integers};
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
