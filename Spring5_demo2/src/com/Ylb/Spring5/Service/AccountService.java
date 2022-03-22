package com.Ylb.Spring5.Service;

import com.Ylb.Spring5.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class AccountService {
    @Autowired
    private AccountDao accountDao;

//转账的方法
    public void accountMoney(){
//        try{
//            第一步开启事务

//            第二部进行实务操作
            accountDao.reduceMoney();
//        模拟异常
//            int i = 10/0;

            accountDao.addMoney();
//            第三步 没有发生异常，提交事务
//        }catch (Exception e){
////            第四步 出现异常，事务回滚
//        }

    }
}
