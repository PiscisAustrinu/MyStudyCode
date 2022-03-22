package com.Ylb.mvc.controller;

import com.Ylb.mvc.Convert.MyDateConvert;
import com.Ylb.mvc.Convert.MyDatePropertyEditor;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

/**
 * Author：Yang Lingbo
 * Date:2022/3/16 15:17
 * Description:
 */
@Controller
public class InitBinderController {
    @InitBinder
    protected void initBinder(WebDataBinder binder){
//        添加自定义属性编辑器
        binder.registerCustomEditor(Date.class,new MyDatePropertyEditor());
//        添加自定义格式化转换器
        binder.addCustomFormatter((Formatter<?>) new MyDateConvert());
    }
    @InitBinder("user")
    public void initBinderUser(WebDataBinder binder){
        binder.setFieldDefaultPrefix("user.");     //设置前端参数匹配前缀
    }
}
