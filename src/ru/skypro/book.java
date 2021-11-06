package ru.skypro;

public class book {
    private String bookName;
    private author authorName;
    private int yearPublication;


    public book (String bookName, author authorName, int yearPublication){
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearPublication = yearPublication;
    }
    public String getbookName(){
        return this.bookName;
    }
    public author getauthorName(){
        return this.authorName;
    }
    public int getYearPublication(){
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
    }


}
