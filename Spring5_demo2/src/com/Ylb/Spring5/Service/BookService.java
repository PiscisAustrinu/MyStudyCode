package com.Ylb.Spring5.Service;

import com.Ylb.Spring5.Dao.BookDao;
import com.Ylb.Spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
//注入Dao
    @Autowired
    private BookDao bookDao;
//    添加图书
    public void addBook(Book book){
        bookDao.add(book);
    }
//    修改图书
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
//    删除图书
    public void deleteBook(int id){
        bookDao.deleteBook(id);
    }
//    查询总记录数
    public int selectCount(){
        return bookDao.selectCount();
    }
//    查询返回对象
    public Book findBook(int id){
        return bookDao.findBook(id);
    }
//    查询返回集合
    public List<Book> findAllBook(){
        return bookDao.findAllBook();
    }
//    批量添加
    public void batchAdd(List<Object[]> batch){
        bookDao.batchAddBook(batch);
    }
//    批量修改
    public void batchUpdate(List<Object[]> batch){
        bookDao.batchUpdateBook(batch);
    }
//    批量删除图书
    public void batchDelete(List<Object[]> batch){
        bookDao.batchDeleteBook(batch);
    }
}
