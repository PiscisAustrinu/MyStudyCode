package com.Ylb.mvc.service;

import com.Ylb.mvc.Bean.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Author：Yang Lingbo
 * Date:2022/3/17 8:34
 * Description:
 */
@Validated
public class UserService {
    public @Valid User getUser(){
        User user = new User();
        user.setAge(180);
        return user;
    }
}
