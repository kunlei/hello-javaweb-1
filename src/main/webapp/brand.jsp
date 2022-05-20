<%@ page import="com.learn.javaweb.pojo.Brand" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: klian
  Date: 5/20/22
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand(1, "Nissan", "Nissan", 100, "Nissan car", 1));
    brands.add(new Brand(2, "Apple", "Apple", 200, "Apple company", 0));
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="Add"> <br>
<hr>

<table border="1" cellspacing="0" width="80">
    <tr>
        <th>No.</th>
        <th>BrandName</th>
        <th>CompanyName</th>
        <th>Ordered</th>
        <th>Description</th>
        <th>Status</th>
    </tr>

    <%
        for (Brand brand : brands) {
          %>
    <tr align="center">
        <td><%=brand.getId()%></td>
        <td><%=brand.getBrandName()%></td>
        <td><%=brand.getCompanyName()%></td>
        <td><%=brand.getOrdered()%></td>
        <td><%=brand.getDescription()%></td>
        <td><%=brand.getStatus()%></td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>
