package com.Ylb.Spring5;

public class LifeCircle {
    private String name;

    public LifeCircle(String name) {
        this.name = name;
        System.out.println("第一步:通过构造器创建Bean实例");
        System.out.println("第二步:为bean的属性设置值和对其他bean引用");
    }
    public void init_method(){
        System.out.println("第三步:调用bean的初始化方法");
    }
    public void destroy_method(){
        System.out.println("第五步:容器关闭时,调用bean的销毁方法");
    }
}
