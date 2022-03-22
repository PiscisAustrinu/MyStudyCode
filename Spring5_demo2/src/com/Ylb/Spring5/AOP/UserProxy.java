package com.Ylb.Spring5.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
@Order(3)
public class UserProxy {


//    抽取相同切入点
    @Pointcut(value = "execution(* com.Ylb.Spring5.AOP.User.add(..))")
    public void pointCut(){

    }
//    前置通知
    @Before(value = "pointCut()")
    public void before(){
        System.out.println("before....");
    }
//    最终通知
    @After(value = "pointCut()")
    public void after(){
        System.out.println("after....");
    }
//    后置通知
    @AfterReturning(value = "pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }

//    环绕通知
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");
    }

//    异常通知
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }
}
