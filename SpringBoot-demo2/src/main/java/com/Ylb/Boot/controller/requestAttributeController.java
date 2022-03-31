package com.Ylb.Boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/28 15:17
 * Description:
 */

@Controller
//@ResponseBody
//@RestController    @RestController是@Controller和@ResponseBody的结合体，两个标注合并起来的作用。
//                   @RestController类中所有的方法只能返回String、Object、Json等实体类对象，不能跳转发到模板页面
public class requestAttributeController {
    @GetMapping("/goto")
    public String gotoPage(HttpServletRequest request){
        request.setAttribute("msg","信息");
        request.setAttribute("username","杨凌波");
        return "forward:/success";        //转发到/success请求
    }

    /**
     * Map、Model、HttpServletRequest类型的参数都是往request域中存放数据
     * @param map
     * @param model
     * @param request
     * @param response
     * @return "forward:/success"
     */
    @GetMapping("/param")
    public String testParam(Map<String,Object> map,
                            Model model,
                            HttpServletRequest request,
                            HttpServletResponse response){
        map.put("map1","mapV1");
        model.addAttribute("model1","modelV1");
        request.setAttribute("request1","requestV1");
        Cookie cookie = new Cookie("c1","v1");
        response.addCookie(cookie);
        return "forward:/success";
    }
    @ResponseBody
    @GetMapping("/success")
    public Map<String,Object> success(@RequestAttribute(value = "msg",required = false) String msg,
                                      @RequestAttribute(value = "username",required = false) String username,
                                      HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        Object username1 = request.getAttribute("username");
        map.put("msg",msg);
        map.put("username",username);
        map.put("username1",username1);
        Object map1 = request.getAttribute("map1");
        Object model1 = request.getAttribute("model1");
        Object request1 = request.getAttribute("request1");
        Object c1 = request.getAttribute("c1");
        map.put("map1",map1);
        map.put("model1",model1);
        map.put("request1",request1);
        map.put("c1",c1);
        return map;
    }
}
