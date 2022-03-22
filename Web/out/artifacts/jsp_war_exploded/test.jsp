<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/6
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--1.声明类属性
2.声明static静态代码块
3.声明类方法
4.声明内部类--%>
<%--1.声明类属性--%>
    <%!
        private int id;
        private String name;
        private static Map<String,Object> map;
    %>
<%--2.声明static静态代码块--%>
    <%!
        static {
            System.out.println("在jsp中声明静态代码块");
            map = new HashMap<String,Object>();
            map.put("key1","value1");
            map.put("key2","value2");
            map.put("key3","value3");
        }
    %>
<%--3.声明类方法--%>
    <%!
        public int test()
        {
            System.out.println("在jsp中声明类方法");
            return 0;
        }
    %>
<%--4.声明内部类--%>
    <%!
        public static class A{
            private int id = 1;
        }
    %>
    <%=12%><br>
    <%=12.12%><br>
    <%="sabi"%><br>
    <%=map%><br>
    <%=request.getParameter("username")%>

<%--1、代码脚本---if语句--%>
    <%
        int i = 12;
        if(i==12)
            System.out.println("ylb真帅");
    %>
<%--2、代码脚本---foe语句--%>
    <%
        for (int k = 0;k<10;k++){
            System.out.println(k);
        }
    %>
<%--3、翻译后java文件中_jspService方法内的代码都可以写--%>
    <%
        String username = request.getParameter("username");
        System.out.println(username);
    %>
</body>
</html>
