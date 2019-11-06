<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html;Utf-8" isELIgnored="false" %>
<html>
<head></head>
<body>

    <c:forEach items="${requestScope.users}" var="user">
        <h1>${user.id}</h1>
    </c:forEach>
    <h1>${requestScope.user.id}</h1>
</body>
</html>