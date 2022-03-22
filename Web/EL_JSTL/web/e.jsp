<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/9
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("a.a.a","aValue");
        map.put("b-b-b","bValue");
        map.put("c+c+c","cValue");
        request.setAttribute("map",map);
    %>
    ${map}
    ${map['a.a.a']}
</body>
</html>
