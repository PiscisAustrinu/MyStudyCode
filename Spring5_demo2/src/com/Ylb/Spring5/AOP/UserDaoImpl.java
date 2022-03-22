package com.Ylb.Spring5.AOP;

public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法被调用....");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法被调用...");
        return id;
    }
}
