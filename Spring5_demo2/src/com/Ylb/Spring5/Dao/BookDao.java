package com.Ylb.Spring5.Dao;

import com.Ylb.Spring5.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void deleteBook(int id);

    int selectCount();

    Book findBook(int id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batch);

    void batchUpdateBook(List<Object[]> batch);

    void batchDeleteBook(List<Object[]> batch);
}