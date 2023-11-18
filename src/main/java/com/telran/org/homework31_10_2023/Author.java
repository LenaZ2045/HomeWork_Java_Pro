package com.telran.org.homework31_10_2023;

public class Author {
    String authorName;
    String authorSurname;
    int bookAge = 0;

    public Author(String authorName, String authorSurname, int bookAge) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.bookAge = bookAge;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public int getBookAge() {
        return bookAge;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", bookAge=" + bookAge +
                '}';
    }
}
