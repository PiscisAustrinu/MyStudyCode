package com.Ylb.Boot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Author：Yang Lingbo
 * Date:2022/3/28 9:46
 * Description:
 */
@RestController
public class rest {
    @GetMapping("/user")
    public String getUser(){
        return "GET";
    }
    @PostMapping("/user")
    public String postUser(){
        return "POST";
    }
    @DeleteMapping("/user")
    public String deleteUser(){
        return "DELETE";
    }
    @PutMapping("/user")
    public String PutUser(){
        return "PUT";
    }
}
