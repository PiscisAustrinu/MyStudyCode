package com.Ylb.Boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/28 15:17
 * Description:
 */
@ResponseBody
@Controller
//@RestController    @RestController是@Controller和@ResponseBody的结合体，两个标注合并起来的作用。
//                   @RestController类中所有的方法只能返回String、Object、Json等实体类对象，不能跳转发到模板页面
public class requestAttributeController {
    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest request){
        request.setAttribute("msg","信息");
        request.setAttribute("username","杨凌波");
        return "forward:/success";        //转发到/success请求
    }
    @ResponseBody
    @GetMapping("/success")
    public Map<String,Object> success(@RequestAttribute("msg") String msg,
                                      @RequestAttribute("username") String username,
                                      HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        Object username1 = request.getAttribute("username");
        map.put("msg",msg);
        map.put("username",username);
        map.put("username1",username1);
        return map;
    }
}
