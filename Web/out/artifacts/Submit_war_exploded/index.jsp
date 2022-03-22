<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2022/1/13
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="http://localhost:8080/Submit/registerServlet" method="get">
    用户名：<input type="text" name="username"><br>
    验证码：<input type="text" style="width: 80px" name="code"><img src="http://localhost:8080/Submit/Kaptcha.jpg" style="width: 100px;height: 28px"><br>
    <input type="submit" value="注册">
  </form>

  </body>
</html>
