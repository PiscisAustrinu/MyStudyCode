package com.Ylb.Spring5;

public class parent {
    private String name;
    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "parent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
