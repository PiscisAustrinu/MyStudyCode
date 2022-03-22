package com.Ylb.Spring5.Service;

import com.Ylb.Spring5.Dao.Dao;

public class Service {
    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void service(){
        System.out.println("测试注入外部bean");
        dao.dao();
    }
}
