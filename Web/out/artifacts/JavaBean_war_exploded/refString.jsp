<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/10
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="paper" class="com.Ylb.bean.Paper"></jsp:useBean>
    <jsp:useBean id="convert" class="com.Ylb.bean.Convert"></jsp:useBean>
<%--    实例化Paper对象和Convert对象  --%>
    <jsp:setProperty name="paper" property="*"></jsp:setProperty>
    <div>
        <h1>调查结果</h1>
        <hr/>
        <ul>
            <li>
                你经常使用的编程语言是：<%=convert.arr2Str(paper.getLanguages())%>。
            </li>
            <li>
                你目前掌握的编程语言是：<%=convert.arr2Str(paper.getTechnics())%>。
            </li>
            <li>
                在学习中感到困难的是：<%=convert.arr2Str(paper.getParts())%>。
            </li>
        </ul>
    </div>
</body>
</html>
