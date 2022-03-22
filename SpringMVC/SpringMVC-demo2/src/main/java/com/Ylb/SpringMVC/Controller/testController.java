package com.Ylb.SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/5 10:50
 * Description:
 */
@Controller
public class testController {
    @RequestMapping("/")
    public String index1(){
        return "index";
    }

    @RequestMapping("/param")
    public String testParam(){
        return "param";
    }
}
