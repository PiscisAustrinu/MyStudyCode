<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/8
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="produce" class="com.Ylb.bean.Produce"></jsp:useBean>
    <div align="center">
        <ul>
            <li>
                商品名称：<jsp:getProperty name="produce" property="name"/>
            </li>
            <li>
                商品价格：<jsp:getProperty name="produce" property="price"/>
            </li>
            <li>
                商品数量：<jsp:getProperty name="produce" property="count"/>
            </li>
            <li>
                商品生产地址：<jsp:getProperty name="produce" property="factoryAdd"/>
            </li>
        </ul>
    </div>
</body>
</html>
