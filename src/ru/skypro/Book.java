package ru.skypro;

import java.util.Objects;

public class Book {
    final String Name;
    final Author authorName;
    private int yearPublication;


    public Book (String bookName, Author author, int yearPublication){
        this.Name = Name;
        this.authorName = author;
        yearPublication = yearPublication;

    }

    public String getName(){
        return this.Name;
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
                "Name='" + Name + '\'' +
                ", authorName=" + authorName.toString() +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(Name, book.Name) && Objects.equals(Name, book.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name,Name, yearPublication);
    }

}
