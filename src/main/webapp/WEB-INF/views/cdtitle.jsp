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

    Tytuł płyty: <form:input path="title"/> </p>

<input type="submit" value="Dodaj"/>
</form:form>
</body>
</html>
