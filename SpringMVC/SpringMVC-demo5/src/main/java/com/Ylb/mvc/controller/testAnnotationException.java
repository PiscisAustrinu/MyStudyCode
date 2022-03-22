package com.Ylb.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author：Yang Lingbo
 * Date:2022/3/12 17:15
 * Description:
 */
//@ControllerAdvice将当前的类标识为异常处理的组件
@ControllerAdvice
public class testAnnotationException {
//    @ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(ArithmeticException.class)
//    ex标识当前请求处理中出现的异常对象
    public String testArithmeticException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
