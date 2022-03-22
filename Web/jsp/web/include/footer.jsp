<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/7
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  页脚信息jsp动态包含
    <%=request.getParameter("username")%>
    <jsp:forward page="/scope2.jsp"></jsp:forward>
</body>
</html>
