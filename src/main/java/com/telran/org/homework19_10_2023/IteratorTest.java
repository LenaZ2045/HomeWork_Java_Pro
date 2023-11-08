package com.telran.org.homework19_10_2023;

import java.util.*;

public class IteratorTest { // Please let me know: I did not see that 10,000,000 m was applied to each situation, or it did???
    public static void main(String[] args) {
        List<CustomIterator> customIterator = new ArrayList<>(10000000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            int temp = i;
            System.out.println(temp);
        }
        long end = System.currentTimeMillis();
        System.out.println(" time to run cycle 'for with 10,000,000 million elements = " + (end - start));
        for (CustomIterator i : customIterator) {
            customIterator.add(i);
        }
// 1 - sort through for-each loop
        long start1 = System.currentTimeMillis();
        customIterator.forEach(element -> {
            System.out.print(" " + element);
        });
        long end1 = System.currentTimeMillis();
        System.out.println("1 time to run 'forEach' loop = " + (end1 - start1));
// 2 - classic for and calling out list.size() for each iteration
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < customIterator.size(); i++) {
            CustomIterator integer = customIterator.get(i);
            System.out.println(" " + integer);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("2 time to run 'classic for' list.size() for each iteration = " + (end2 - start2));
// 3 - classic for, but list.size() define into variable
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < customIterator.size(); i++) {
            int listSize = customIterator.size();
            System.out.println(" " + listSize);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("3 time to run 'classic for' but defining list.size() into variable = " + (end3 - start3));
// 4 - classic for, list.size() defining into variable and sort through but backward
        long start4 = System.currentTimeMillis();
        for (int i = customIterator.size(); i >= 0; i--) {
            int listSize = customIterator.size();
            System.out.println("#4 = " + listSize);
        }
        long end4 = System.currentTimeMillis();
        System.out.println("4 time to run classic for, list.size() defining into variable and sort through but backward = " + (end4 - start4));
// 5 - when we use Iterator
        long start5 = System.currentTimeMillis();
        Iterator<CustomIterator> iterator = customIterator.iterator();
        while (iterator.hasNext()) {
            int next = customIterator.size();
            System.out.print(next + " ");
        }
        long end5 = System.currentTimeMillis();
        System.out.println("5 time to run, when we use Iterator = " + (end5 - start5));
// 6 - when using ListIterator
        long start6 = System.currentTimeMillis();
        ListIterator<CustomIterator> iterator1 = customIterator.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(" " + iterator1.next());
        }
        long end6 = System.currentTimeMillis();
        System.out.println("6 time to run, when using ListIterator = " + (end6 - start6));
    }
}
