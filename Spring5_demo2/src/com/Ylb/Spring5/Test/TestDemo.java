package com.Ylb.Spring5.Test;

import com.Ylb.Spring5.AOP.User;
import com.Ylb.Spring5.Anno.Autowired;
import com.Ylb.Spring5.Config.SpringConfig;
import com.Ylb.Spring5.Config.TxConfig;
import com.Ylb.Spring5.Service.AccountService;
import com.Ylb.Spring5.Service.BookService;
import com.Ylb.Spring5.Service.UserService;
import com.Ylb.Spring5.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    @Test
    public void testService(){
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);       //注册注解类
        context.scan("com.Ylb.Spring5.SpringConfig");
        context.refresh();          //更新容器
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println("实例化"+userService);
        userService.add();
//        销毁容器
        ((AbstractApplicationContext)context).registerShutdownHook();
    }

//    AOP完全注解开发
    @Test
    public void testAnnoAop(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfig.class);//注册注解类
        context.scan("com.Ylb.Spring5.SpringConfig");
        context.refresh();          //更新容器
        User user = context.getBean("user",User.class);
        user.add();
    }


    @Test
    public void testAutowired(){
        ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
        Autowired autowired = context.getBean("autowired",Autowired.class);
        autowired.getAnno();
        autowired.getAnnos();
        autowired.getAnnoSet();
        autowired.getAnnoMap();
    }

//   测试AOP
    @Test
    public void testAop(){
        ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }

    @Test
    public void testJdbctemplate(){
        ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        Book book = new Book();
//        添加图书
        book.setId(1);
        book.setName("Java从入门到精通");
        book.setPrice(21);
        bookService.addBook(book);

//        修改图书
        bookService.updateBook(book);

//        删除图书
        bookService.deleteBook(1);

//        查询记录数
        bookService.selectCount();

//        查询某个图书
        Book book1 = bookService.findBook(2);
        System.out.println(book1);

//        查询所有图书
        List<Book> allBook = bookService.findAllBook();
        System.out.println(allBook);

//        批量添加图书
        List<Object[]> batchs = new ArrayList<>();
        for (int i = 3;i<6;i++){
            Object[] a = {i,"sql",101};
            batchs.add(a);
        }
        bookService.batchAdd(batchs);

//        批量修改图书
        List<Object[]> batch = new ArrayList<>();
        for (int i = 3;i<6;i++){
            Object[] a = {"jdbcTemplate",202,i};
            batch.add(a);
        }
        bookService.batchUpdate(batch);

//        批量删除图书
        List<Object[]> batch1 = new ArrayList<>();
        for (int i = 3;i<6;i++){
            Object[] a = {i};
            batch1.add(a);
        }
        bookService.batchDelete(batch1);
    }

//    注解式声明事务管理
    @Test
    public void testAccount(){
        ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

//    XML式声明事务管理
    @Test
    public void testXMLAccount(){
        ApplicationContext context = new FileSystemXmlApplicationContext("bean1.xml");
        AccountService accountService = context.getBean("accountService",AccountService.class);
        accountService.accountMoney();
    }

//    完全注解式事务管理
    @Test
    public void testAccount1(){
        ApplicationContext context =  new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService",AccountService.class);
        accountService.accountMoney();
    }

//    函数式风格创建对象，交给spring进行管理
    @Test
    public void testGenericApplicationContext(){
//        1、创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
//        2、调用context的方法对象注册
        context.refresh();
        context.registerBean("test",test.class,()-> new test());
//        3、获取在Spring注册的对象
        test test = (com.Ylb.Spring5.Test.test) context.getBean("test");
        System.out.println(test);

    }
}
