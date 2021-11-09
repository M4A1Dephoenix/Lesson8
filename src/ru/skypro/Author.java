package ru.skypro;

public class Author {
    final String name;
    final String surName;
    public Author(String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    public String getName(){
        return name;
    }
    public String getSurName(){
        return surName;
    }
}
