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
    <form action="refString.jsp" method="post">
        <div>
            <h1>调查问卷</h1>
            <hr/>
            <ul>
                <li>你经常用哪些编程语言开发程序：</li>
                <li>
                    <input type="checkbox" name="languages" value="Java">Java
                    <input type="checkbox" name="languages" value="JavaScript">JavaScript
                    <input type="checkbox" name="languages" value="C++">C++
                    <input type="checkbox" name="languages" value="Golang">Golang
                </li>
            </ul>
            <ul>
                <li>你目前掌握的技术：</li>
                <li>
                    <input type="checkbox" name="technics" value="HTML">HTML
                    <input type="checkbox" name="technics" value="CSS">CSS
                    <input type="checkbox" name="technics" value="mysql">mysql
                </li>
            </ul>
            <ul>
                <li>你觉得有困难的部分：</li>
                <li>
                    <input type="checkbox" name="parts" value="HTML">HTML
                    <input type="checkbox" name="parts" value="mysql">mysql
                </li>
            </ul>
            <input type="submit" value="提  交">
        </div>
    </form>
</body>
</html>
