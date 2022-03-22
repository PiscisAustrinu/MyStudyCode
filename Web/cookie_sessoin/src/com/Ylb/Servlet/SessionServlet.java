package com.Ylb.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends BaseServlet{
    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取和创建Session对象
        HttpSession session = req.getSession();
//        判断当前Session会话是否是新创建出来的
        boolean isNew = session.isNew();
//        获取Session会话的唯一标识id
        String id = session.getId();
        resp.getWriter().write("得到的Session，它的id是："+id+"<br/>");
        resp.getWriter().write("这个Session是否是新创建的："+isNew+"<br/>");
    }

    /**
     * 往Session域中保存数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1","value1");
        resp.getWriter().write("已经往Session域中保存key1");
    }

    /**
     * 获取Session域中的数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object key1 = req.getSession().getAttribute("key1");
        resp.getWriter().write("congSession中获取的key1的数据是："+key1);
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("Session的默认超时时长为："+maxInactiveInterval+"秒");
    }

    protected void set3sLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        先获取Session对象
        HttpSession session = req.getSession();
//        设置超时时长
        session.setMaxInactiveInterval(3);
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("session的超时时长为："+maxInactiveInterval);
    }
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        先获取Session对象
        HttpSession session = req.getSession();
//        让Session会话马上超时
        session.invalidate();
        resp.getWriter().write("Session已经设置为超时");
    }
}
