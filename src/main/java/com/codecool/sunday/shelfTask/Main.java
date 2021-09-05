package com.codecool.sunday.shelfTask;

public class Main {
    public static void main(String[] args) {
        Shelf<Book> shelf = new Shelf<>(); // Todo finish
        shelf.addElement(new Book("Quo Vadis", "Henryk Sienkiewicz", 1896, 20.0));
        shelf.addElement(new Book("The Last Wish", "Andrzej Sapkowski", 1993, 25.0));
        shelf.addElement(new Book("A Game of Thrones", "George R. R. Martin", 1996, 35.7));
        shelf.addElement(new Book("Arthas: Rise of the Lich King", "Christie Golden", 2009, 10.0));
        shelf.addElement(new Book("Very heavy book", "John Cena", 2021, 150.1));
        shelf.sortElementOnShelf();
        shelf.printElements();
    }
}
