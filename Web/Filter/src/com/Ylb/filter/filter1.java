package com.Ylb.filter;

import javax.servlet.*;
import java.io.IOException;

public class filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("前置代码1");
        System.out.println(Thread.currentThread().getName());
        chain.doFilter(request, response);
        System.out.println("后置代码1");
    }

    @Override
    public void destroy() {

    }
}
