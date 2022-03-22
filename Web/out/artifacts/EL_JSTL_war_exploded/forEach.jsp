<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Ylb.pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/11
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
<%--        begin属性是开始的索引
            end属性是结束的索引
            var属性是遍历的变量，也是正在遍历的值--%>
        <c:forEach begin="1" end="10" var="i">
            <tr>
                <td>第${i}行</td>
            </tr>
        </c:forEach>

    </table>
    <hr>
<%--    2、遍历Object数组
        item表示遍历的数据源
        var白女士循环的变量，也是正在遍历的数据--%>
    <%
        request.setAttribute("arr",new String[]{"15290701833","13687721413","15939518732"});
    %>
    <c:forEach items="${requestScope.arr}" var="item">
        ${item}<br>
    </c:forEach>
<%--    4、遍历Map集合--%>
    <hr/>
    <%
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        request.setAttribute("map",map);
    %>
    <c:forEach items="${requestScope.map}" var="entry">
        ${entry.key} = ${entry.value}<br>
    </c:forEach>
    <hr/>
<%--    3、遍历List集合，list中存放Student，包含属性编号、用户名、密码、电话--%>
    <%
        List<Student> students = new ArrayList<Student>();
        for (int i = 1 ; i <=10 ; i++) {
            students.add(new Student(i,"username"+i,"password"+i,"phone"+i));
        }
        request.setAttribute("stu",students);
    %>
    <table border="1">
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>电话</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.stu}" var="stu" begin="2" end="7" step="2" varStatus="status">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.password}</td>
            <td>${stu.phones}</td>
            <td>${status}</td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>
