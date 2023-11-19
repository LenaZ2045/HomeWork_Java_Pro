package com.telran.org.homework31_10_2023.task_1;

public class Book extends BookShelf {
    private StringBuilder bookName;
    private StringBuilder bookAuthorName;
    private StringBuilder bookAuthorSurname;
    private StringBuilder bookPublishingHouse;
    private int publisherFoundationYear;
    private int authorBookAge;
    private int bookPagesQuantity;
    private int bookPublishingYear;

    public Book(String bookName, String bookAuthorName, String bookAuthorSurname, String bookPublishingHouse, int publisherFoundationYear, int authorBookAge, int bookPagesQuantity, int bookPublishingYear) {
        this.bookName = new StringBuilder(bookName);
        this.bookAuthorName = new StringBuilder(bookAuthorName);
        this.bookAuthorSurname = new StringBuilder(bookAuthorSurname);
        this.bookPublishingHouse = new StringBuilder(bookPublishingHouse);
        this.publisherFoundationYear = publisherFoundationYear;
        this.authorBookAge = authorBookAge;
        this.bookPagesQuantity = bookPagesQuantity;
        this.bookPublishingYear = bookPublishingYear;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName='" + bookName + '\'' + ", bookAuthorName='" + bookAuthorName + '\'' + ", bookAuthorSurname='" + bookAuthorSurname + '\'' + ", bookPublishingHouse='" + bookPublishingHouse + '\'' + ", publisherFoundationYear=" + publisherFoundationYear + ", authorBookAge=" + authorBookAge + ", bookPagesQuantity=" + bookPagesQuantity + ", bookPublishingYear=" + bookPublishingYear + '}';
    }
}
