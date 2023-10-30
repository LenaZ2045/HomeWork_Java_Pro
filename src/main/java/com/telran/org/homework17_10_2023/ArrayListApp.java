package com.telran.org.homework17_10_2023;

import java.util.*;

public class ArrayListApp {
    public static void main(String[] args) {
//      in this list found 1 odd number under index 1, but do not know how to enter return "7"
//      from this array in console
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(12);
        list.add(4);
        System.out.println(list);
        System.out.println("The size of Int list: " + list.size());
        System.out.println("This list contains only odd numbers: " + returnOddList(list));

//      in this list I run over the list and doubled each element when multiplied by 2
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(7);
        list3.add(8);
        list3.add(12);
        list3.add(4);
        System.out.println(list3);
        System.out.println("Each element in the list doubled " + returnDoubledList(list3));

//      in this list I returned the length/size of the String list
        List<String> list1 = new ArrayList<>();
        list1.add("mother");
        list1.add("father");
        list1.add("sister");
        list1.add("brother");
        list1.add("sister");
        System.out.println(list1);
        System.out.println("List size when added together: " + listSizeElements(list1) + " : " + list1.addAll(list1));

//      in this list I implemented SortedSet and class TreeSet which has built in alphabetical
//      sort and TreeSet does not record doubled set of list
        SortedSet<String> list2 = new TreeSet<>();
        list2.add("mother");
        list2.add("father");
        list2.add("sister");
        list2.add("brother");
        list2.add("sister");
        System.out.println(list2); // put in alphabet order
        System.out.println(list2.size()); // does not calculate the similar names (no duplicates)
    }

//  method which multiplies each element in array by 2
    public static List<Integer> returnDoubledList(List<Integer> list3) {
        for (int i = 0; i < list3.size(); i++) {
            list3.set(i, list3.get(i) * 2);
        }
        return list3;
    }

//  method which counts each String element, adds it up, and returns sum of elements in the list
    public static int listSizeElements(List<String> list1) {
        int i;
        for (i = 0; i < list1.size(); i++) {
            i = i++;
        }
        return i;
    }

//  method which defines the odd elements from the list
    public static List<Integer> returnOddList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) % 2);
            if (i % 2 == 1) {
                return Collections.singletonList(list.get(i));
            }
        }
        return list;
    }
}


