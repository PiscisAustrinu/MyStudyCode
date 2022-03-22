package com.Ylb.Spring5;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void studentTest(){
        System.out.println("姓名："+name+"\n"+"学号："+id);
    }
}
