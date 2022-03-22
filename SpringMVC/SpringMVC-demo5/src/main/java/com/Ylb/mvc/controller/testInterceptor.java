package com.Ylb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/11 18:39
 * Description:
 */
@Controller
public class testInterceptor {
    @GetMapping("/**/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}
