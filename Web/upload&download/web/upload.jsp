<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/11
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data" action="http://localhost:8080/upload_download/uploadServlet">
        用户名：<input name="username" type="text">
        头像：<input type="file" name="photo">
        <input type="submit" value="提交">
    </form>
</body>
</html>
