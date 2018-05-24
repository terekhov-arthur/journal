<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Access Denied</title>
</head>
<body>    
    <div>
          <h3>You do not have permission to access this page!</h3>
    </div>
     <form:form action="/logout" method="post">
          <input type="submit" value="Sign in as different user" />
    </form:form>  
</body>
</html>