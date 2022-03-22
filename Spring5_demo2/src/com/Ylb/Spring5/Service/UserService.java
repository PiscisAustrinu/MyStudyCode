package com.Ylb.Spring5.Service;

import com.Ylb.Spring5.Dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;
@Service
public class UserService {
//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

//    /**
//     * 该注解方法在该类实例初始化时调用
//     */
//    @PostConstruct
//    public void startAnno(){
//        System.out.println("userService实例开始初始化");
//    }

    @Value(value = "value")
    private String name;
    public void add(){
        System.out.println("add ....."+name);
        userDao.add();
    }

    /**
     * 该注解方法在该类实例销毁时调用
     */
    @PreDestroy
    public void endAnno(){
        System.out.println("userService实例销毁");
    }
}
