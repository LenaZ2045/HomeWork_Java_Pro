package com.telran.org.homework31_10_2023.task_1;

import java.util.*;

public class BookSortApp {
    public static void main(String[] args) {
        Book book1 = new Book("Created To Be His Help Meet", "Debi", "Pearl", "No Greater Joy Ministries", 1994, 9, 338, 2014);
        Book book2 = new Book("The 5 Love Languages", "Gary", "Chapman", "NorthField", 1896, 9, 206, 2014);
        Book book3 = new Book("Wild", "Cheryl", "Strayed", "Vintage", 1954, 11, 338, 2012);
        Book book4 = new Book("The Esther Anointing", "Michelle", "McClain", "Charisma House", 1975, 9, 146, 2014);
        Book book5 = new Book("Seeking God First", "Anita", "Keagy", "JoyShop Ministries", 2006, 0, 198, 2023);
        Book book6 = new Book("The Lost Art of Reverie", "Rae", "Walsh", "On Kindle Scribe", 2007, 4, 324, 2019);
        Book book7 = new Book("Bo's Cafe", "John", "Lynch", "Windblown media", 2007, 14, 256, 2009);

        HashMap<Book, Integer> books = new HashMap<>();
        books.put(book1, 1994);
        books.put(book2, 1896);
        books.put(book3, 1954);
        books.put(book4, 1975);
        books.put(book5, 2006);
        books.put(book6, 2007);
        books.put(book7, 2007);
        System.out.println(books);
        books.size();

        Author bookOne = new Author("Debi", "Pearl", 9);
        Author bookTwo = new Author("Gary", "Chapman", 9);
        Author bookThree = new Author("Cheryl", "Strayed", 11);
        Author bookFour = new Author("Michelle", "McClain", 9);
        Author booFive = new Author("Anita", "Keagy", 0);
        Author bookSix = new Author("Rae", "Walsh", 4);
        Author bookSeven = new Author("John", "Lynch", 14);

        List<Author> bookList = Arrays.asList(bookOne, bookTwo, bookThree, bookFour, booFive, bookSix, bookSeven);
        Scanner scanner = new Scanner(System.in);
        System.out.println("To sort book by author enter '1' ");


        if (scanner.hasNext()) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }
            System.out.println();
            SortByAuthorName sortByAuthorName = new SortByAuthorName();
            Collections.sort(bookList, sortByAuthorName);
            System.out.println(bookList);
        }

        Publisher bookA = new Publisher("No Greater Joy Ministries", 1994);
        Publisher bookB = new Publisher("NorthField", 1896);
        Publisher bookC = new Publisher("Vintage", 1954);
        Publisher bookD = new Publisher("CharismaHouse", 1975);
        Publisher bookE = new Publisher("JoyShop Ministries", 2006);
        Publisher bookF = new Publisher("On Kindle Scribe", 2007);
        Publisher bookG = new Publisher("Windblown Media", 2007);
        List<Publisher> bookList1 = Arrays.asList(bookA, bookB, bookC, bookD, bookE, bookF, bookG);
        scanner.next();
        System.out.println("To sort book by publishing year enter '2' ");
        if (scanner.hasNext()) {
            for (int i = 0; i < bookList1.size(); i++) {
                System.out.println(bookList1.get(i));
            }
            System.out.println();
            SortByPublisherFoundationAge sortByPublisherFoundationAge = new SortByPublisherFoundationAge();
            Collections.sort(bookList1, sortByPublisherFoundationAge);
            System.out.println(bookList1);
        }
    }
}
