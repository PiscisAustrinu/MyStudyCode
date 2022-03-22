package com.Ylb.Servlet2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet1获取请求参数-->"+req.getParameter("username"));

        System.out.println("Servlet1处理请求-->");
        req.setAttribute("key","S1");

        System.out.println("获取Servlet2路径-->");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

        System.out.println("请求传到Servlet2-->");

        requestDispatcher.forward(req,resp);
    }
}
