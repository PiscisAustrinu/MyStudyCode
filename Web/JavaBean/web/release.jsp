<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/9
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="news" class="com.Ylb.bean.News"></jsp:useBean>
    <jsp:useBean id="encoding" class="com.Ylb.bean.CharacterEncoding"></jsp:useBean>
    <jsp:setProperty name="news" property="*"/>
    <div align="center">
        <div id="container">
            <div id="title">
                <%=encoding.toString(news.getTitle())%>
            </div>
            <hr>
            <div id="content">
                <%=encoding.toString(news.getContent())%>
            </div>
        </div>
    </div>
</body>
</html>
