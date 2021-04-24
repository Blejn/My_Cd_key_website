
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp" %>
<br>
Nazwa użytkownika:
<br>
<form:input path="nick"/>
<br>
Haslo:
<br>
<form:input path="password"/>
<br>
<%@include file="footer.jsp" %>
</body>
</html>
