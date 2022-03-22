<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/10
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        #clock{
            width: 420px;
            height: 80px;
            background: #E0E0E0;
            font-size: 25px;
            font-weight: bold;
            border: solid 5px orange;
            padding: 20px;
        }
        #week{
            padding-top: 15px;
            color: #0080FF;
        }
    </style>
</head>
<body>
    <jsp:useBean id="date" class="com.Ylb.bean.DateBean" scope="application"></jsp:useBean>
    <div align="center">
        <div id="clock">
            <div id="time">
                <jsp:getProperty name="date" property="dataTime"/>
            </div>
            <div id="week">
                <jsp:getProperty name="date" property="week"/>
            </div>
        </div>
    </div>
</body>
</html>
