package com.Ylb.Boot.bean;

import lombok.Data;

import java.util.Date;

/**
 * Author：Yang Lingbo
 * Date:2022/3/29 15:31
 * Description:
 */
@Data
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}
