package com.Ylb.Spring5.Aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ClassA implements ApplicationContextAware {
    private ApplicationContext applicationContext;       //应用上下文对象属性
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//       设置上下文对象属性的值
        this.applicationContext = applicationContext;
    }
    public ClassB getBeanB(){
        return applicationContext.getBean("beanB",ClassB.class);
    }
}
