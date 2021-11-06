package ru.skypro;

public class author {
    private String name;
    private String soName;
    public author(String name, String soName){
        this.name = name;
        this.soName = soName;
    }

    public String getName(){
        return this.name;
    }
    public String getSoName(){
        return this.soName;
    }
}
