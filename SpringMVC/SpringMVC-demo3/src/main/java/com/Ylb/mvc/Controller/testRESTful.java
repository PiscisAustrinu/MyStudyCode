package com.Ylb.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * Author：Yang Lingbo
 * Date:2022/3/9 15:31
 * Description:
 */
@Controller
public class testRESTful {

    /**
     * 查询所有用户信息
     * /user  Get请求
     * @return  地址
     */
    @GetMapping("/user")
    public String getUser(){
        System.out.println("查询所有用户");
        return "success";
    }

    /**
     * 根据id查询用户信息
     * /user/${}   Get请求
     * @return
     */
    @GetMapping("/user/{id}")
    public String getUserById(){
        System.out.println("根据id查询用户");
        return "success";
    }

    /**
     * 添加用户
     * /user   Post请求
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/user")
    public String addUser(String username,String password){
        System.out.println("添加用户：用户名"+username+",密码："+password);
        return "success";
    }

    /**
     * 修改用户
     * /user--->put请求方式
     * @param username
     * @param password
     * @return
     */
    @PutMapping("/user")
    public String updateUser(String username,String password){
        System.out.println("修改用户：用户名"+username+",密码："+password);
        return "success";
    }

    /**
     * 根据id删除用户
     * /user/{id}---->delete
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")
    public String deleteUser(String id){
        System.out.println("删除id为"+id+"的用户");
        return "success";
    }
}
