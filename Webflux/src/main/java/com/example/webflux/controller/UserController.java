package com.example.webflux.controller;

import com.example.webflux.entiy.User;
import com.example.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {
//    注入Service
    @Autowired
    private UserService userService;
//    id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
//    查询所有用户
    @GetMapping("/user")
    public Flux<User> getUsers(){
        return userService.getAllUsers();
    }
//    添加用户
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> userMono = Mono.just(user);
        return userService.saveUser(userMono);
    }
}
