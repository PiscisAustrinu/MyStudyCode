package com.Ylb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/13 10:12
 * Description:
 */
@Controller
public class testException {
    @RequestMapping("/testException")
    public String testException(){
        System.out.println(1/0);
        return "success";
    }
}
