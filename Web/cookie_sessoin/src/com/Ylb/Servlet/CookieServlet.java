package com.Ylb.Servlet;

import com.Ylb.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet{
    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1、创建Cookie对象
        Cookie cookie = new Cookie("key1","value1");
//        2、通知客户端保存Cookie
        resp.addCookie(cookie);
//        1、创建Cookie对象
        Cookie cookie1 = new Cookie("key2","value2");
//        2、通知客户端保存Cookie
        resp.addCookie(cookie1);
        resp.getWriter().write("cookie create succeed!" +
                "cookie 创建成功");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        for (Cookie cookie:cookies){
//            getName方法返回Cookie的key
//            getValue方法返回Cookie的value值
            resp.getWriter().write("Cookie["+cookie.getName()+"]"+"="+cookie.getValue()+"]<br/>");
        }
        Cookie iWantCookie = CookieUtils.findCookie("key1",cookies);
//        for (Cookie cookie:cookies){
//            if ("key2".equals(cookie.getName())){
//                iWantCookie = cookie;
//                break;
//            }
//        }
        if (iWantCookie!=null){
            resp.getWriter().write("找到了需要的Cookie");
        }
    }


    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*//        方案一：
//        1、先创建一个要修改的同名的Cookie对象
//        2、在构造器，同时赋予新的Cookie值。
        Cookie cookie = new Cookie("key1","newValue1");
//        3、、调用response.addCookie(Cookie)；通知客户端保存修改
        resp.addCookie(cookie);
        resp.getWriter().write("key1的Cookie已经修改好");*/
//        方案二：
//        1、先查找到需要修改的Cookie对象
        Cookie cookie = CookieUtils.findCookie("key2",req.getCookies());
        if (cookie!=null){
            //        2、调用setValue()方法赋予新的Cookie值
            cookie.setValue("newValue2");
//        3、调用response.addCookie()通知客户端保存修改
            resp.addCookie(cookie);
        }
        resp.getWriter().write("key2的Cookie已经修改好");
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defaultLife","defaultLife");
        cookie.setMaxAge(-1);//设置存活时间
        resp.addCookie(cookie);
    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        先找到要删除的Cookie对象
        Cookie cookie = CookieUtils.findCookie("key1",req.getCookies());
        if (cookie!=null){
            //        调用setMaxAge(0)
            cookie.setMaxAge(0);
//        调用response.addCookie(cookie)
            resp.addCookie(cookie);
            resp.getWriter().write("key1的Cookie已经被删除");
        }
    }

    protected void life10(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("life10","life10");
        cookie.setMaxAge(10);
        resp.addCookie(cookie);
        resp.getWriter().write("已经创建一个存活10s的Cookie");
    }


    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1","path1");
        cookie.setPath(req.getContextPath()+"/abc");
        resp.addCookie(cookie);
        resp.getWriter().write("创建了一个带有Path路径的Cookie");
    }
}
