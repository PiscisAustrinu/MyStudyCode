package src.com.Ylb.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ServletContext2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        System.out.println("获取web Context key1的值"+context.getAttribute("key1"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
