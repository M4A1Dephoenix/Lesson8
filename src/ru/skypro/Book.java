package ru.skypro;

import java.util.Objects;

public class Book {
    final String bookName;
    final Author authorName;
    private int yearPublication;


    public Book (String bookName, Author author, int yearPublication){
        this.bookName = bookName;
        this.authorName = author;
        yearPublication = yearPublication;

    }

    public String getBookName(){
        return this.bookName;
    }
    public Author getAuthor(){
        return authorName;
    }
    public int getYearPublication(){
        return yearPublication;
    }
    public void setYearPublication(int yearPublication){
        yearPublication = yearPublication;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName=" + authorName.toString() +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, yearPublication);
    }

}
