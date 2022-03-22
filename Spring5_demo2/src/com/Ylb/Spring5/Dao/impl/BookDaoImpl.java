package com.Ylb.Spring5.Dao.impl;

import com.Ylb.Spring5.Dao.BookDao;
import com.Ylb.Spring5.entity.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
//    注入JdbcTemplate
    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //    添加图书
    @Override
    public void add(Book book){
//        1、创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        Object args[] = {book.getId(),book.getName(),book.getPrice()};

        int update = jdbcTemplate.update(sql,args);

        System.out.println(update);
    }

//    修改图书
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set name = ?,price = ? where id = ?";
        Object args[] = {"JavaScript",99,book.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
//  删除图书
    @Override
    public void deleteBook(int id) {
        String sql = "delete from t_book where id = ?";
        int update = jdbcTemplate.update(sql, 1);
        System.out.println(update);
    }

//    查询返回总记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
        return integer;
    }
//  查询返回对象
    @Override
    public Book findBook(int id) {
        String sql = "select * from t_book where id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

//    查询返回集合
    @Override
    public List<Book> findAllBook(){
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }
//  批量添加图书
    @Override
    public void batchAddBook(List<Object[]> batch) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batch);
        System.out.println(Arrays.toString(ints));
    }
//  批量修改图书
    @Override
    public void batchUpdateBook(List<Object[]> batch) {
       String sql = "update t_book set name = ?,price = ? where id = ?" ;
        int[] ints = jdbcTemplate.batchUpdate(sql, batch);
        System.out.println(Arrays.toString(ints));
    }
//  批量删除图书
    @Override
    public void batchDeleteBook(List<Object[]> batch) {
        String sql = "delete from t_book where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batch);
        System.out.println(Arrays.toString(ints));
    }
}
