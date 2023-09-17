package com.example.BookStorage.repository;

import com.example.BookStorage.model.Book;

import java.util.List;

public interface BookRepoInterface {

    List<Book> getAllBooks();

    void saveBook(Book book);
}
