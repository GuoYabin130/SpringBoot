<%@ page pageEncoding="UTF-8" contentType="text/html;Utf-8" isELIgnored="false" %>
<html>
<head></head>
<body>

<form action="${pageContext.request.contextPath}/receive/r2" method="get">
    id<input type="text" name="id">
    usernaem<input type="text" name="username">
    password<input type="password" name="password">
    iphone<input type="text" name="iphone">
    <input type="submit" value="提交">
</form>
</body>
</html>