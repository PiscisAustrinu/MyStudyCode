<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/8
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("key","key1");
    %>
    表达式脚本输出的key值是：<%=request.getAttribute("key")%><br>
    EL表达式输出的key值是：${key}
</body>
</html>
