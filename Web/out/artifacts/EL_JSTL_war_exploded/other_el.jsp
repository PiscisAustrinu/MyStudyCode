<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/10
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    输出参数username的值：${param.username}<br>
    输出ylb178的第一个爱好：${paramValues.hobby[0]}<br>
    输出ylb178的第二个爱好：${paramValues.hobby[1]}<br>
    <hr>
    输出请求头：${header}<br>
    输出请求头accept-language的值：${headerValues['accept-language'][0]}<br>
    输出请求头User-agent的第一个值：${headerValues['User-Agent'][0]}<br>
    <hr>
    输出cookie的名字：${cookie.JSESSIONID.name}<br>
    输出cookie的值：${cookie.JSESSIONID.value}<br>
    <hr>
    输出&lt;Context-param&gt;username 的值：${ initParam.username } <br>
    输出&lt;Context-param&gt;mysql 的值：${ initParam.mysql } <br>
</body>
</html>
