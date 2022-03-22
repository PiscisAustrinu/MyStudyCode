package com.Ylb.Servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet2获取请求参数-->"+req.getParameter("username"));
        System.out.println("Servlet2检查是否请求是否经过Servlet1处理-->");
        req.getAttribute("key");
        System.out.println("Servlet2处理请求-->");
        System.out.println("Servlet2已经处理浏览器请求");
    }
}
