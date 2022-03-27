package com.Ylb.SpringBoot.controller;

import com.Ylb.SpringBoot.bean.Phone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：Yang Lingbo
 * Date:2022/3/24 21:01
 * Description:
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    Phone phone;
    @RequestMapping("/phone")
    public Phone getPhone() {
        return phone;
    }

    @RequestMapping("/hello")
    private String handler01(){
        log.info("请求进来了");
        return "hello,Spring Boot2";
    }
}
