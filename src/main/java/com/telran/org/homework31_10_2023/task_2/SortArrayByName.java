package com.telran.org.homework31_10_2023.task_2;

import java.util.Comparator;

public class SortArrayByName implements Comparator<StringArraySorting> {
    @Override
    public int compare(StringArraySorting o1, StringArraySorting o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
