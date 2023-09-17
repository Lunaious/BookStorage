package com.example.BookStorage.service;

import com.example.BookStorage.model.Book;

import java.util.List;

public interface BookServInterface {
    List<Book> getAllBooks();

    void saveBook(Book book);
}
