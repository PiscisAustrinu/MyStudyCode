package com.Ylb.Spring5.bean;

public class Dept {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Dept(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
