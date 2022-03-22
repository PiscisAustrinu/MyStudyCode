package com.Ylb.Spring5.Dao.impl;

import com.Ylb.Spring5.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDao add....");
    }
}
