package com.telran.org.homework31_10_2023.task_2;

import java.util.*;

public class StringArraySorting {
    String name;
    String lastName;

    public StringArraySorting(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StringArraySorting{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StringArraySorting arraySorting1 = new StringArraySorting("abc", "last");
        StringArraySorting arraySorting2 = new StringArraySorting("pklz", "yelp");
        StringArraySorting arraySorting3 = new StringArraySorting("rpng", "note");
        StringArraySorting arraySorting4 = new StringArraySorting("ppza", "xyz");
        List<StringArraySorting> unsortedArray = Arrays.asList(arraySorting1, arraySorting2, arraySorting3, arraySorting4);

        for (int i = 0; i < unsortedArray.size(); i++) {
            System.out.println(unsortedArray.get(i));
        }
        System.out.println();
        SortArrayByName sortArrayByName = new SortArrayByName();
        Collections.sort(unsortedArray, sortArrayByName);
        System.out.println("SORTED BY ALPHABET ACCENDING ORDER " + unsortedArray);
    }

}
