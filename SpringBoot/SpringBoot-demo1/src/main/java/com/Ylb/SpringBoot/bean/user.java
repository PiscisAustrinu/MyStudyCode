package com.Ylb.SpringBoot.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author：Yang Lingbo
 * Date:2022/3/25 10:47
 * Description:
 */
@Data
@NoArgsConstructor
@ToString
public class user {
    private String name;
    private int age;
    private pet pet;

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
