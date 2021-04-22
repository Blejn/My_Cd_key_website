<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 10.04.2021
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Zamówienie</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <link rel="stylesheet" href="/style.css">
</head>
<body>
<%@include file="header.jsp" %>
<form:form method="post" modelAttribute="customers">
    <br>
    Imię:
    <br>
    <form:input path="firstName"/>
    <br>
    Nazwisko:
    <br>
    <form:input path="lastName"/>
    <br>
    Województwo:
    <br>
    <form:input path="voivodeship"/>
    <br>
    Miasto:
    <br>
    <form:input path="city"/>
    <br>
    Ulica(nazwa i numer)
    <br>
    <form:input path="street"/>
    <br>
    Numer telefonu:
    <br>
    <form:input path="number"/>
    <br>
    Kod pocztowy:
    <br>
    <form:input path="postal_code"/>
    <br>
    Email:
    <br>
    <form:input path="email"/>


    <br>
    <input type="submit" value="Wyślij"/>

</form:form>


<%@include file="footer.jsp" %>
</body>
</html>
