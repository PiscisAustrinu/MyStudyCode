package com.Ylb.Spring5.Dao;

public class DaoImpl implements Dao{
    @Override
    public void dao() {
        System.out.println("注入外部bean成功");
    }
}
