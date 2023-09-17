package com.example.BookStorage.model;

import java.sql.Date;

public class Book {
    private int id;
    private String title;
    private String author;
    private Date published_date;

    public Book() {
    }

    public Book(int id, String title, String author, Date published_date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.published_date = published_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }
}
