<%--
  Created by IntelliJ IDEA.
  User: klian
  Date: 5/21/22
  Time: 10:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--    <c:if test="true">--%>
<%--        <h1>true</h1>--%>
<%--    </c:if>--%>

<%--    <c:if test="false">--%>
<%--        <h1>false</h1>--%>
<%--    </c:if>--%>

    <c:if test="${status == 1}">
        status on
    </c:if>

    <c:if test="${status == 0}">
        status off
    </c:if>


</body>
</html>
