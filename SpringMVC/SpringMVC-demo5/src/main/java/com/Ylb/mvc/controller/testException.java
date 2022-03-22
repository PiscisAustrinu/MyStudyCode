package com.Ylb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/12 16:56
 * Description:
 */
@Controller
public class testException {
    @GetMapping("/testSimpleException")
    public String testSimpleException(){
        System.out.println(1/0);
        return "success";
    }
}
