<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2022/1/22
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        System.out.println("a.jsp页面执行");
        Object user = session.getAttribute("user");
//        如果等于null，说明没有登陆
        if (user==null){
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }
    %>
    我是a.jsp文件
</body>
</html>
