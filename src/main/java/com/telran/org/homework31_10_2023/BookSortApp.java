package com.telran.org.homework31_10_2023;

import java.util.HashMap;
import java.util.Scanner;

public class BookSortApp {
    public static void main(String[] args) {
        Book book1 = new Book("Created To Be His Help Meet", "Debi", "Pearl", "No Greater Joy Ministries", 9, 338, 2014);
        Book book2 = new Book("The 5 Love Languages", "Gary", "Chapman", "NorthField", 9, 206, 2014);
        Book book3 = new Book("Wild", "Cheryl", "Strayed", "Vintage",11, 338, 2012);
        Book book4 = new Book("The Esther Anointing", "Michelle", "McClain", "Charisma House", 9, 146, 2014);
        Book book5 = new Book("Seeking God First", "Anita", "Keagy", "JoyShop Ministries", 0, 198, 2023);
        Book book6 = new Book("The Lost Art of Reverie", "Rae", "Walsh", "On Kindle Scribe", 4, 324, 2019);
        Book book7 = new Book("Bo's Cafe", "John", "Lynch", "Windblown media", 14, 256, 2009);

        Scanner scanner = new Scanner(System.in);
        System.out.println("How do you wish to sort books on shelf ?");
        scanner.nextLine();
    }
}
