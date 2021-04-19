<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 13.04.2021
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp " %>
<form>
    <label for="login">Login: </label>
    <input type="text" id="login" placeholder="podaj login"/>
    <br>
    <label for="password">nazwisko: </label>
    <input type="text" id="password" placeholder="podaj hasło"/>
    <br>
    <input type="submit" value="Wyślij"/>
</form>
<%@include file="footer.jsp " %>
</body>
</html>
