package com.Ylb.Spring5.Anno;

import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class ResourceAnno {
    @Resource           //注解使用在属性上，注入注解自定义类的对象
    private Anno anno;
    @Resource           //注解使用在属性上，注入容器类的对象
    private ApplicationContext context;

    @Resource           //注解使用在setter方法上，注入参数定义的对象
    public void setAnno(Anno anno){
        this.anno = anno;
    }
}
