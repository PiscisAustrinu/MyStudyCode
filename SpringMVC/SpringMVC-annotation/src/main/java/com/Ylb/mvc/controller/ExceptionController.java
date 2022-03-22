package com.Ylb.mvc.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author：Yang Lingbo
 * Date:2022/3/13 10:09
 * Description:
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(ArithmeticException.class)
    public String testArithmeticException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
