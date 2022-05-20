<%--
  Created by IntelliJ IDEA.
  User: klian
  Date: 5/20/22
  Time: 8:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        System.out.println("Hello JSP!");
        int i = 3;
    %>

<%=
    "hello"
%>
<%=i%>

<%!
    void show() {}
    String name = "John";
%>
</body>
</html>
