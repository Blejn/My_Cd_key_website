<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 23.04.2021
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="cdkeys">
    <br>
    Nazwa płyty:
    <br>
    <form:input path="title"/>
    <br>
    <input type="submit" value="Dodaj do bazy"/>
</form:form>
</body>
</html>
