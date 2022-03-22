<%@ page import="com.Ylb.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 28624
  Date: 2021/12/8
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Person person = new Person();
        person.setName("杨凌波");
        person.setPhones(new String[]{"15290701833","13687721413","15939518732"});
        List<String> cities = new ArrayList<String>();
        cities.add("河南");
        cities.add("广西");
        cities.add("漯河");
        person.setCities(cities);
        Map<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        person.setMap(map);
        pageContext.setAttribute("person",person);
    %>
    输出person：${person}<br>
    输出person的phones：${person.phones[0]}<br>
    输出person的city：${person.cities[0]}<br>
    输出person的map集合：${person.map}<br>
    输出map集合中某个key值：${person.map.key1}
</body>
</html>
