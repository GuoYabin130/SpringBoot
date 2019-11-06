<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" contentType="text/html;Utf-8" isELIgnored="false" %>
<html>
<head></head>
<body>

<form action="${pageContext.request.contextPath}/receive/r3" method="post">
    爱好 唱跳<input type="checkbox" value="1" name="hobby">
        Rap<input type="checkbox" value="2" name="hobby">
        篮球<input type="checkbox" value="3" name="hobby">
    <input type="submit" value="提交">
    <c:forEach
</form>
</body>
</html>