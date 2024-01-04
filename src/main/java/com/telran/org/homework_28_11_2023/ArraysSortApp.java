package com.telran.org.homework_28_11_2023;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysSortApp {

    public static void main(String[] args) {
//  # 1 Task
        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        Collections.sort(list);
        System.out.println("Alphabetical order sort " + list);

        System.out.println();
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse alphabetical order sort " + list);
//  # 2 Task
        System.out.println();
        List<String> list1 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        Collections.sort(list1);
        List<String> alphabeticalOrderDistinct = list1.stream().distinct().collect(Collectors.toList());
        List<String> reverseOrderDistinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Alphabetical order-distinct: " + alphabeticalOrderDistinct);
        System.out.println();
        System.out.println("Reverse order-distinct: " + reverseOrderDistinct);
//  # 3 Task
        List<String> list2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        String smallest = Collections.min(list2);
        System.out.println();
        System.out.println("The most smallest element is: " + smallest);
    }
}