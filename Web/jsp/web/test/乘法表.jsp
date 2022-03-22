<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/7
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
    <style type="text/css">
        table{
            width: 650px;
            border: solid;
            color: red;
        }
    </style>
</head>
<body>
<%--练习1：输出一个九九乘法表--%>
    <h1 align="center">九九乘法口诀表</h1>
    <table align="center">
        <%for (int i = 1; i <= 9 ; i++) {%>
        <tr>
            <%for (int j = 1; j <= i ; j++) {%>
            <td>
                <%=j+"x"+i+"="+i*j%>
                <%}%>
            </td>
        </tr>
        <%}%>
    </table>
</body>
</html>
