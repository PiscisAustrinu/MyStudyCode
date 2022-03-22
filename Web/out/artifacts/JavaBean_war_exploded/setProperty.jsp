<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/8
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="produce" class="com.Ylb.bean.Produce"></jsp:useBean>
    <jsp:setProperty name="produce" property="name" value="iphone13"></jsp:setProperty>
    <jsp:setProperty name="produce" property="price" value="8888.88"></jsp:setProperty>
    <jsp:setProperty name="produce" property="count" value="100"></jsp:setProperty>
    <jsp:setProperty name="produce" property="factoryAdd" value="美丽国"></jsp:setProperty>
    <div align="center">
        <ul>
            <li>
                商品名称：<jsp:getProperty property="name" name="produce" />
            </li>
            <li>
                商品价格：<jsp:getProperty property="price" name="produce" />
            </li>
            <li>
                商品数量：<jsp:getProperty property="count" name="produce" />
            </li>
            <li>
                商品生产地址：<jsp:getProperty property="factoryAdd" name="produce" />
            </li>
        </ul>
    </div>
</body>
</html>
