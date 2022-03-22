<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2022/1/22
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    登录页面
    <form action="http://localhost:8080/Filter/loginServlet" method="get">
        用户名：<input type="text" name="user"><br/>
        密  码：<input type="password" name="password"><br/>
        <input type="submit">
    </form>
</body>
</html>
