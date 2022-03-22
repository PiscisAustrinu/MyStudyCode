package com.Ylb.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/6 15:03
 * Description:
 */
@Controller
public class testController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/testView")
    public String testView(){
        return "testView";
    }

    @RequestMapping("/testRESTful")
    public String testRESTful(){
        return "testRESTful";
    }
}
