package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.Book;

import java.util.List;

public interface BookServices {

    Book save(Book book);

    Book insert(Book book);

    List<Book> getAll();

    Book get(int id);

    void delete(int id);

}
