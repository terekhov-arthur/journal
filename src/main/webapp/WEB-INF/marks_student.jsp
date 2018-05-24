<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Sign in</title>
</head>
<body> 
<table>
    <tr>
        <th>Full Name</th>
    </tr>
    <c:forEach var="item" items="${students}">
        <tr>
            <td>${item.fullName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>