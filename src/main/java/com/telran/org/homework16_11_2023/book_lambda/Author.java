package com.telran.org.homework16_11_2023.book_lambda;

public class Author {
    String authorName;
    String authorSurname;
    int bookAge;

    public Author(String authorName, String authorSurname, int bookAge) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.bookAge = bookAge;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Author{" + "authorName='" + authorName + '\'' + ", authorSurname='" + authorSurname + '\'' + ", bookAge=" + bookAge + '}';
    }
}
