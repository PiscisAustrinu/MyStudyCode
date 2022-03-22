package com.Ylb.Spring5.autowire;

public class Student {
    private Class aClass;

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "aClass=" + aClass +
                '}';
    }

    public void test(){
        System.out.println(aClass);
    }
}
