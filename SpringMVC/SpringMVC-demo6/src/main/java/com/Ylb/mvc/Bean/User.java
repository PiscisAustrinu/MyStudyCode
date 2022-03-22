package com.Ylb.mvc.Bean;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import java.util.Date;

/**
 * Author：Yang Lingbo
 * Date:2022/3/15 19:21
 * Description:
 */
@Component
public class User {
    @Max(value = 100,message = "老不死的，还不死？")
    private int age;
    private String name;
    private Date birthday;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
