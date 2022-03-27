package com.Ylb.boot.controller;

import com.Ylb.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：Yang Lingbo
 * Date:2022/3/27 16:40
 * Description:
 */
@RestController
public class PersonController {
    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person getPerson(){
        System.out.println(person.getName());
        return person;
    }
}
