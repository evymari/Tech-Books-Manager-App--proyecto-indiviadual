package com.example.bookManager;

import java.util.ArrayList;

public class BookManager {
    ArrayList<Book> bookList = new ArrayList<Book>();

    public BookManager() {
    }
}
/* private BookRepository bookRepository = new BookRepository();


public void createBook(String isbn, String title, String author) {
    Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);

    if (optionalBook.isPresent()) {
        throw new IllegalArgumentException("Este book ya existe");
    }
    Book newBook = new Book(isbn, title, author);
    bookRepository.save(newBook);
}

public void deleteByIsbn(String isbnToDelete) {
    bookRepository.deleteByIsbn(isbnToDelete);
}

public List<Book> getAllBooks() {
    return bookRepository.findAll();
}*/