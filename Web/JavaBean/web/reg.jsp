<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/8
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="person" class="com.Ylb.bean.Person" scope="page">
    <jsp:setProperty name="person" property="*"></jsp:setProperty>
</jsp:useBean>
    <table align="center" width="400">
        <tr>
            <td align="right">姓名：</td>
            <td>
                <jsp:getProperty name="person" property="name"/>
            </td>
        </tr>
        <tr>
            <td align="right">年龄：</td>
            <td>
                <jsp:getProperty name="person" property="age"/>
            </td>
        </tr>
        <tr>
            <td align="right">性别：</td>
            <td>
                <jsp:getProperty name="person" property="sex"/>
            </td>
        </tr>
        <tr>
            <td align="right">住址：</td>
            <td>
                <jsp:getProperty name="person" property="address"/>
            </td>
        </tr>
    </table>
</body>
</html>
