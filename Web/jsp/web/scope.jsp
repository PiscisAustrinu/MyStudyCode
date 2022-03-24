<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/7
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>scope.jsp页面</h1>
    <%
        pageContext.setAttribute("key","pageContext");
        request.setAttribute("key","request");
        session.setAttribute("key","session");
        application.setAttribute("key","application");
    %>
    pageContext域是否有值：<%=pageContext.getAttribute("key")%><br>
    request域是否有值：<%=request.getAttribute("key")%><br>
    session域是否有值：<%=session.getAttribute("key")%><br>
    application域是否有值：<%=application.getAttribute("key")%><br>
    <%
        request.getRequestDispatcher("/scope2.jsp").forward(request,response);
    %>
</body>
</html>
