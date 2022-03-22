<%@ page import="com.Ylb.bean.Email" %><%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/8
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <%
            String emailAdd = request.getParameter("mailAdd");
            Email email = new Email(emailAdd);
            if(email.isEmail()){
                out.print(emailAdd+"<br>是一个标准的邮箱地址！<br>");
            }else {
                out.print(emailAdd+"<br>不是一个标准的邮箱地址！<br>");
            }
        %>
        <a href="index.jsp"></a>
    </div>
</body>
</html>
