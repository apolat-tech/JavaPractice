package com.syntax.class20;

public class Book {
    String nameOfTheBook;
    int numberOfPages;

    Book(String nameOfTheBook, int numberOfPages) {
        this.nameOfTheBook = nameOfTheBook;
        this.numberOfPages = numberOfPages;
    }

    Book() {
        System.out.println("Name of the book is");
    }

    public static void main(String[] args) {
        Book book1 = new Book("BOOK", 450);
        System.out.println(book1.nameOfTheBook + " is the name of the book and it is " + book1.numberOfPages + " pages");
        Book book2 = new Book();
    }
}

