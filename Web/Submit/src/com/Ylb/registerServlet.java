package com.Ylb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class registerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取Session中的验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
//        删除Session的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
//        获取表单中的验证码
        String code =req.getParameter("code");
        String username = req.getParameter("username");
        if (token!=null&&token.equalsIgnoreCase(code)){
            System.out.println("保存到数据库"+username);
        }else {
            System.out.println("请不要重复提交表单");
        }
        resp.sendRedirect(req.getContextPath()+"/ok.jsp");
    }
}
