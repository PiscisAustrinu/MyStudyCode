package com.Ylb.Spring5.Dao.impl;

import com.Ylb.Spring5.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    多钱
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money-? where name = ?";
        jdbcTemplate.update(sql,100,"lucy");
        System.out.println("向marry转账100￥");
    }

//    少钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where name = ?";
        jdbcTemplate.update(sql,100,"marry");
        System.out.println("lucy向您转账100￥");
    }
}
