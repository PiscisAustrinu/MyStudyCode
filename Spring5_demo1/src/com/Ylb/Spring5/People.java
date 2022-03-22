package com.Ylb.Spring5;

public class People {
    private String name;
    private int age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void testDI(){
        System.out.println("姓名:"+name+"\n"+"年龄："+age+"\n"+"性别："+sex);
    }
}
