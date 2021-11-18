package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author dostoevskiy = new Author("Фёдор","Достоевский");
        Author pushkin = new Author("Александр","Пушкин");
    Book jidYankel = new Book("Жид Янкель",dostoevskiy,1844);
    Book evgeniyOnegin = new Book("Евгений Онегин",pushkin,1833);
    System.out.println("Книга 2 " + evgeniyOnegin.getName() + " Автор " + evgeniyOnegin.getName() + " год публикации " + evgeniyOnegin.getYearPublication());
    evgeniyOnegin.setYearPublication(1834);
    System.out.println("После изменения года у 'Евгений онегин'");
    System.out.println("Книга 1 " + jidYankel.getName() + " Автор " + jidYankel.getName() + " год публикации " + jidYankel.getYearPublication());
    System.out.println("Книга 2 " + evgeniyOnegin.getName() + " Автор " + evgeniyOnegin.getName() + " год публикации " + evgeniyOnegin.getYearPublication());

    }
}
