package com.Ylb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/8 16:30
 * Description:
 */
@Controller
public class jspController {
    @RequestMapping("/testSuccess")
    public String testJSP(){
        return "success";
    }
}
