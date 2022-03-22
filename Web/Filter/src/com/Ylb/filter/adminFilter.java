package com.Ylb.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class adminFilter implements Filter {
    public adminFilter(){
        System.out.println("1.Filter构造器方法");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("2.Filter初始化方法");
//        1、获取Filter的名称filter-name的内容
        System.out.println("filter-name的值是："+filterConfig.getFilterName());
//        2、获取在Filter中配置的init-param初始参数
        System.out.println("init-param初始参数是："+filterConfig.getInitParameter("namespace"));
//        3、获取ServletContext对象
        System.out.println("ServletContext对象是："+filterConfig.getServletContext());
    }

    /**
     * 用于处理请求（过滤、拦截可以做权限检查）
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("3.Filter过滤器方法");
//        把ServletRequest转换成HttpServletRequest
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if (user == null){
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }else{
//            让程序继续访问用户目标资源
            chain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("4.Filter销毁方法");
    }
}
