package com.Ylb.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/7 14:55
 * Description:
 */
@Controller
public class ViewController {
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(){
        return "success";
    }
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleaf";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleaf";
    }
}
