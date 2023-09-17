package com.example.BookStorage.controller;

import com.example.BookStorage.model.Book;
import com.example.BookStorage.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }
}
