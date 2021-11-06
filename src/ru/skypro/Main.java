package ru.skypro;

public class Main {

    public static void main(String[] args) {
        author dostoevskiy = new author("Фёдор","Достоевский");
        author pushkin = new author("Александр","Пушкин");
    book jidYankel = new book("Жид Янкель",dostoevskiy,1844);
    book evgeniyOnegin = new book("Евгений Онегин",pushkin,1833);
    System.out.println("Книга 2 " + evgeniyOnegin.getbookName() + " Автор " + evgeniyOnegin.getauthorName() + " год публикации " + evgeniyOnegin.getYearPublication());
    evgeniyOnegin.setYearPublication(1834);
    System.out.println("После изменения года у 'Евгений онегин'");
    System.out.println("Книга 1 " + jidYankel.getbookName() + " Автор " + jidYankel.getauthorName() + " год публикации " + jidYankel.getYearPublication());
    System.out.println("Книга 2 " + evgeniyOnegin.getbookName() + " Автор " + evgeniyOnegin.getauthorName() + " год публикации " + evgeniyOnegin.getYearPublication());

    }
}
