package ru.skypro;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearPublication;


    public Book (String name, Author author, int yearPublication){
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;

    }

    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return author;
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
                "Name='" + name + '\'' +
                ", authorName=" + author.toString() +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,name, yearPublication);
    }

}
