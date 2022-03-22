package com.Ylb.Spring5.C_and_P;

public class C {
    private String name;
    private int age;
    private P p;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setP(P p) {
        this.p = p;
    }

    public C(String name, P p) {
        this.name = name;
        this.p = p;
    }
}
