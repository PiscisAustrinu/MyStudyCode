package com.Ylb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/13 9:30
 * Description:
 */
@Controller
public class testController {

    @RequestMapping("/")
    public String testIndex(){
        return "index";
    }
}
