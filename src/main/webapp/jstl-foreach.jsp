<%--
  Created by IntelliJ IDEA.
  User: klian
  Date: 5/21/22
  Time: 10:20 PM
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

<c:forEach items="${brands}" var="brand">
    <tr align="center">
        <td>${brand.id}</td>
        <td>${brand.brandName}</td>
        <td>${brand.companyName}</td>
        <td>${brand.ordered}</td>
        <td>${brand.description}</td>A
        <c:if test="${brand.status == 1}">
            <td>on</td>
        </c:if>
        <c:if test="${brand.status == 0}">
            <td>off</td>
        </c:if>
        <br>
    </tr>
</c:forEach>

</body>
</html>
