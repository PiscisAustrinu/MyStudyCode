package src.com.Ylb.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContextServlet", value = "/ContextServlet")
public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.获取web.xml中配置上下问的参数，context-param
        ServletContext servletContext = getServletConfig().getServletContext();
        System.out.println("context-param参数username的值为："+servletContext.getInitParameter("username"));
//        2.获取当前的工程路径，格式：/工程路径
        System.out.println("当前工程路径为："+ servletContext.getContextPath());
//        3.获取工程部署在服务器硬盘上的绝对路径
//            / 被服务器解析为：http://ip:port/工程名/
        System.out.println("工程部署的路径是："+servletContext.getRealPath("/"));
        System.out.println("获取web下的css文件路径:"+servletContext.getRealPath("/css"));
//        4.像Map一样存取数据
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
