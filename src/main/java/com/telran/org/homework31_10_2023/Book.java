package com.telran.org.homework31_10_2023;

public class Book extends BookShelf implements Author, Publisher {
    private String bookName;
    private String bookAuthorName = Author.authorName;
    private String bookAuthorSurname = Author.authorSurname;
    private String bookPublishingHouse = Publisher.publisherName;
    private int publisherFoundationYear = Publisher.publisherFoundationYear;
    private int authorBookAge = Author.bookAge;
    private int bookPagesQuantity;
    private int bookPublishingYear;

    public Book(String bookName, String bookAuthorName, String bookAuthorSurname, String bookPublishingHouse, int authorBookAge, int bookPagesQuantity, int bookPublishingYear) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookAuthorSurname = bookAuthorSurname;
        this.bookPublishingHouse = bookPublishingHouse;
        this.authorBookAge = authorBookAge;
        this.bookPagesQuantity = bookPagesQuantity;
        this.bookPublishingYear = bookPublishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public String getBookAuthorSurname() {
        return bookAuthorSurname;
    }

    public String getBookPublishingHouse() {
        return bookPublishingHouse;
    }

    public int getPublisherFoundationYear() {
        return publisherFoundationYear;
    }

    public int getBookAuthorAge() {
        return authorBookAge;
    }

    public int getBookPagesQuantity() {
        return bookPagesQuantity;
    }

    public int getBookPublishingYear() {
        return bookPublishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookAuthorSurname='" + bookAuthorSurname + '\'' +
                ", bookPublishingHouse='" + bookPublishingHouse + '\'' +
                ", publisherFoundationYear=" + publisherFoundationYear +
                ", authorBookAge=" + authorBookAge +
                ", bookPagesQuantity=" + bookPagesQuantity +
                ", bookPublishingYear=" + bookPublishingYear +
                '}';
    }
}
