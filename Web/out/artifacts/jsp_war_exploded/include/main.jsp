<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/7
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    头部信息<br>
    主题页面<br>
    <jsp:include page="/include/footer.jsp">
        <jsp:param name="username" value="root"/>
    </jsp:include>
</body>
</html>
