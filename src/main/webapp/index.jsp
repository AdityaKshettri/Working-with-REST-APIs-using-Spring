<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Spring Rest Demo</h1>
        <hr>
        <a href="${pageContext.request.contextPath}/test/hello">Hello</a>
        <hr>
        <a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
        <hr>
    </body>
</html>
