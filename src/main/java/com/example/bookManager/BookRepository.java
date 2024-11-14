package com.example.bookManager;

import java.util.ArrayList;
import java.util.Optional;

public class BookRepository {
    private ArrayList<Book> bookList = new ArrayList<>();
    private MySQLBookRepository bookRepository = new MySQLBookRepository();

    public void createBook(String isbn, String title, String author) {
        Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);
        if (optionalBook.isPresent()) {
            throw new IllegalAccessException("Este book ya existe");
        }
        java.awt.print.Book book = new java.awt.print.Book(isbn, title, author);
        bookRepository.save(book);
    }

    public void deleteByIsbn(String isbnToDelete) {
        bookRepository.deletByIsbn(isbnToDelete);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
