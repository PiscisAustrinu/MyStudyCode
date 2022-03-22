package com.example.webflux.service;

import com.example.webflux.entiy.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService{

    private final Map<Integer,User> userMap = new HashMap<>();

    public UserServiceImpl() {
        this.userMap.put(1,new User("杨凌波",20,"男"));
        this.userMap.put(2,new User("韦炎",22,"女"));
    }

//    根据id查询用户
    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(userMap.get(1));
    }
//  查询所有用户
    @Override
    public Flux<User> getAllUsers() {
        return Flux.fromIterable(userMap.values());
    }

    @Override
    public Mono<Void> saveUser(Mono<User> userMono) {
        return userMono.doOnNext(person->{
//            向Map里面放值
            int id = userMap.size()+1;
            userMap.put(id,person);
        }).thenEmpty(Mono.empty());//终止数据流
    }
}
