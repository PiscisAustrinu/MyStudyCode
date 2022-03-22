package com.Ylb.Spring5.book;

public class StaticFactoryService {
    public static StaticFactoryService service = new StaticFactoryService();//静态实例


//    静态方法，返回该类的静态实例
    public static StaticFactoryService getInstance(){
        return service;
    }
}
