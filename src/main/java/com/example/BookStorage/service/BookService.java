package com.example.BookStorage.service;

import com.example.BookStorage.model.Book;
import com.example.BookStorage.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServInterface{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }

    public void saveBook(Book book){
        bookRepository.saveBook(book);
    }
}
