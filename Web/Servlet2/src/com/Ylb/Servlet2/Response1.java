package com.Ylb.Servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游 Response1");
        //设置响应状态码302，表示重定向
//        resp.setStatus(302);
//        //设置响应头，说明新地址在哪里
//        resp.setHeader("Location","response2");
        resp.sendRedirect("http://lcoalhost:8080");
    }
}
