package com.example.webflux.service;

import com.example.webflux.entiy.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
//    1、根据id查询用户
    Mono<User> getUserById(int id);

//    2、查询所有用户
    Flux<User> getAllUsers();
//    3、添加用户
    Mono<Void> saveUser(Mono<User> userMono);
}
