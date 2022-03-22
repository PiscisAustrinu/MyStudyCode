package com.Ylb.Spring5.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {
    @Before(value = "execution(* com.Ylb.Spring5.AOP.User.add(..))")
    public void before(){
        System.out.println("Person before....");
    }
}
