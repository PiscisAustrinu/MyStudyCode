package com.Ylb.Spring5.Anno;
public class Required {
    private String name;

    @org.springframework.beans.factory.annotation.Required  //检查属性是否进行了依赖注入
    public void setName(String name) {
        this.name = name;
    }
}
