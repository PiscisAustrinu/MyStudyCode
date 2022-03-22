package com.Ylb.Spring5.AOP;

import org.springframework.stereotype.Component;

//被增强类
@Component
public class User {
//    切入点
    public void add(){
        System.out.println("add....");
    }
}
