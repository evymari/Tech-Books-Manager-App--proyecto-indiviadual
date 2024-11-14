package com.example.bookManager;

public class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title:'" + title + '\'' +
                ", author:'" + author + '\'' +
                '}';
    }

    public String getAutor() {
        return author;
    }

    public String getTitulo() {
        return title;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }
}
