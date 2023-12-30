package com.telran.org.homework16_11_2023.book_lambda;

import com.telran.org.homework31_10_2023.task_1.BookShelf;

public class Book extends BookShelf {
    private final StringBuilder bookName;
    private final StringBuilder bookAuthorName;
    private final StringBuilder bookAuthorSurname;
    private final StringBuilder bookPublishingHouse;
    private final int publisherFoundationYear;
    private final int authorBookAge;
    private final int bookPagesQuantity;
    private final int bookPublishingYear;

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
