package ru.skypro;

public class Book {
    final String bookName;
    final Author authorName;
    private int yearPublication;


    public Book (String bookName, Author authorName, int yearPublication){
        this.bookName = bookName;
        this.authorName = authorName;
        yearPublication = yearPublication;
    }
    public String getbookName(){
        return this.bookName;
    }
    public Author getauthorName(){
        return authorName;
    }
    public int getYearPublication(){
        return yearPublication;
    }
    public void setYearPublication(int yearPublication){
        yearPublication = yearPublication;
    }


}
