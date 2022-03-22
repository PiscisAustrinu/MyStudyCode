package com.Ylb.Servlet2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //设置服务器字符集
//        resp.setCharacterEncoding("UTF-8");//支持中文，默认是ISO-8859-1
//        //通过响应头，设置浏览器字符集
//        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        resp.setContentType("text/html; charset=UTF-8");//同时设置客户端和服务器的字符集为UTF-8
        //此方法必须在获取流对象之前使用才有效
        PrintWriter writer = resp.getWriter();
        writer.write("杨凌波");
    }
}
