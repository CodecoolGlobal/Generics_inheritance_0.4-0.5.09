package com.codecool.sunday.shelfTask;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int year;
    private double weight;

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public Book(String name, String author, int year, double weight) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

}
