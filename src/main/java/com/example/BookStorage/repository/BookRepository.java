package com.example.BookStorage.repository;

import com.example.BookStorage.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository implements BookRepoInterface{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Book> getAllBooks(){
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getDate("published_date")
                ));
    }
    @Override
    public void saveBook(Book book){
        String sql = "INSERT INTO books (title, author, published_date) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,book.getTitle(), book.getAuthor(), book.getPublished_date());
    }
}
