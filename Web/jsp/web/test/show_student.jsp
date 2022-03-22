<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Ylb.pojo.student_message" %>
<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/7
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show_student</title>
    <style>
        table{
            border: aqua 1px solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border:aqua 1px solid;
        }
    </style>
</head>
<body>
<%--练习2：输出一个表格，里面有10个学生的信息--%>
    <h1 align="center">学生信息表</h1>
    <%
        List<student_message> student_messages = (List<student_message>) request.getAttribute("stuList");
    %>
    <table align="center">
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>手机号</td>
            <td>操作</td>
        </tr>
        <%for(student_message studentMessage:student_messages){ %>
        <tr>
            <td><%=studentMessage.getId()%></td>
            <td><%=studentMessage.getName()%></td>
            <td><%=studentMessage.getAge()%></td>
            <td><%=studentMessage.getPhone()%></td>
            <td>开除、保研</td>
        </tr>
        <%}%>
    </table>

</body>
</html>
