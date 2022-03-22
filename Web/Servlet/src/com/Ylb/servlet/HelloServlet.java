package src.com.Ylb.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化方法");
//        1.可以获取Servlet程序的别名servlet-name的值
        System.out.println("Servlet程序的别名："+servletConfig.getServletName());
//        2.获取初始化参数init-param
        System.out.println("获取初始化参数："+servletConfig.getInitParameter("username"));
//        3.获取ServletContext对象
        System.out.println(servletConfig.getServletContext());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*
    * service方法专门用来处理请求和反应
    * */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet被访问了");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method =  httpServletRequest.getMethod();
        if ("GET".equals(method) ){
            doGet();
        }else if(("POST").equals(method)){
            doPost();
        }
    }

    public void doGet(){
        System.out.println("get方法");
        System.out.println("get方法");
    }
    public void doPost(){
        System.out.println("post方法");
        System.out.println("post方法");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
