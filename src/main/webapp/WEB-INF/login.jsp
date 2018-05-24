<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Sign in</title>
</head>
<body> 
<form:form action="/login" method="post">
       <input type="text" name="username" placeholder="User Name" /><br/>
       <input type="password" name="password" placeholder="Password" /><br/>
       <input type="submit" value="Sign In"/>
    <c:if test="${param.error ne null}">
       <div>Invalid username and password.</div>
    </c:if>
    <c:if test="${param.logout ne null}">
       <div>You have been logged out.</div>
    </c:if> 
</form:form>
</body>
</html>