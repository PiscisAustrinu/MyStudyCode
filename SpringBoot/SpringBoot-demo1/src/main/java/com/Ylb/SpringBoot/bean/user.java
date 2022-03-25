package com.Ylb.SpringBoot.bean;

/**
 * Author：Yang Lingbo
 * Date:2022/3/25 10:47
 * Description:
 */
public class user {
    private String name;
    private int age;
    private pet pet;

    public user() {
    }

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public com.Ylb.SpringBoot.bean.pet getPet() {
        return pet;
    }

    public void setPet(com.Ylb.SpringBoot.bean.pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
