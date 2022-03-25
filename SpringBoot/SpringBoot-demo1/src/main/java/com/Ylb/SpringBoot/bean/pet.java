package com.Ylb.SpringBoot.bean;

/**
 * Author：Yang Lingbo
 * Date:2022/3/25 10:48
 * Description:
 */
public class pet {
    private String name;

    public pet() {
    }

    public pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
