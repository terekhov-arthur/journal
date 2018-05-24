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
        <th></th>
    </tr>
    <c:forEach var="entry" items="${journal}">
        <tr>
            <td>${entry.key.fullName}</td>
            <td>
                <table>
                    <tr>
                        <th>Subject</th>
                        <th>Mark</th>
                    </tr>
                    <c:forEach var="item" items="${entry.value}">
                        <tr>
                            <td>${item.subject.name}</td>
                            <td>${item.mark}</td>
                        </tr>
                    </c:forEach>
                </table>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>