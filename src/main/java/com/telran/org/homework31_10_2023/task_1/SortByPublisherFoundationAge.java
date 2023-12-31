package com.telran.org.homework31_10_2023.task_1;

import com.telran.org.homework31_10_2023.task_1.Publisher;

import java.util.Comparator;

public class SortByPublisherFoundationAge implements Comparator<Publisher> {
    @Override
    public int compare(Publisher o1, Publisher o2) {
        return o1.getPublisherFoundationYear() - o2.getPublisherFoundationYear();
    }
}
