package com.Ylb.Spring5.MethodReplacer;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class NewEraPeople implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] args) throws Throwable {
        String inputParam = (String)args[0];
        System.out.println("传入参数："+inputParam);
        String newStr = inputParam+"在新时代吃肉";
        System.out.println("替换返回新的字符串或对象");
        System.out.println(newStr);
        return newStr;
    }
}
