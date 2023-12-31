package com.telran.org.homework31_10_2023.task_1;

import com.telran.org.homework31_10_2023.task_1.Author;

import java.util.Comparator;

public class SortByAuthorName implements Comparator<Author> {
    @Override
    public int compare(Author o1, Author o2) {
        return o1.getAuthorName().compareTo(o2.getAuthorName());
    }
}
