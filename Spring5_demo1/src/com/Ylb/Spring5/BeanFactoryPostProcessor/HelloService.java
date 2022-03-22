package com.Ylb.Spring5.BeanFactoryPostProcessor;

public class HelloService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloService{" +
                "name='" + name + '\'' +
                '}';
    }
}
