package com.Ylb.mvc.controller;

import com.Ylb.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpResponse;

/**
 * Author：Yang Lingbo
 * Date:2022/3/10 16:32
 * Description:
 */
@Controller
public class HttpMassageController {

    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody:"+requestBody);
        return "success";
    }

    @PostMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println("请求头："+requestEntity.getHeaders());
        System.out.println("请求体："+requestEntity.getBody());
        return "success";
    }

    @GetMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello,response!");
    }

    @GetMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }

    @GetMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        return new User(1,"杨凌波",20,"男");
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username,String password){
        System.out.println(username+","+password);
        return "hello,ajax";
    }
}
