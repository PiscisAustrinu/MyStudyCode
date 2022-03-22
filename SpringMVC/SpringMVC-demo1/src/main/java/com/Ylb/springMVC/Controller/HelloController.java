package com.Ylb.springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/5 8:13
 * Description:我的第一个SpringMVC控制器
 */
@Controller
public class HelloController {
    /*
        @RequestMapping注解：处理请求和控制器方法之间的映射关系
        @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示当前工程的上下文路径localhost：8080/SpringMVC
     */
    @RequestMapping("/")
    public String index(){
//        设置视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
