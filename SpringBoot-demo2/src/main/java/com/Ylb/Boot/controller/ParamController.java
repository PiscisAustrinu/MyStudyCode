package com.Ylb.Boot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/28 10:46
 * Description:
 */
@RestController
public class ParamController {
    @RequestMapping("/car/{id}/owner/{name}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("name") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> headers,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("hobbies") List<String> hobbies,
                                     @RequestParam Map<String,String> requestParam){

        Map<String,Object> map = new HashMap<>();
//        map.put("id",id);
//        map.put("name",name);
//        map.put("pv",pv);
//        map.put("userAgent",userAgent);
//        map.put("headers",headers);
        map.put("requestParam",requestParam);
        return map;
    }

    @PostMapping("/save")
    public Map PostParam(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }
//    1、语法：/cars/sell;low=34;brand=byd,audi,yd
//    2、SpringBoot默认是禁用了矩阵变量的功能
//          手动开启：对路径的处理，UrlPathHelper进行解析
//                  removeSemicolonContent(移出分号内容)支持矩阵变量的
//    3、矩阵变量必须有url路径变量才能被解析
    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brand,
                        @PathVariable("path") String path){
        Map<String,Object> map = new HashMap<>();
        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }
//    /boss/1;age=20/2;age=10
    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId")Integer empAge){
        Map<String,Object> map = new HashMap<>();
        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;
    }
}
