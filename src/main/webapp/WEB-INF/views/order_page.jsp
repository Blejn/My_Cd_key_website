<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 10.04.2021
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form  method="post">
    <label for="name">imię: </label>
    <input type="text" id="name" placeholder="podaj imię"/>
    <br>
    <label for="lastName">nazwisko: </label>
    <input type="text" id="lastName" placeholder="podaj nazwisko"/>
    <br>
    <label for="voivodeship">Województwo: </label>
    <input type="text" id="voivodeship" placeholder="podaj województwo"/>
    <br>

    <label for="city">Miasto: </label>
    <input type="text" id="city" placeholder="podaj miasto"/>
    <br>


    <label for="street">Nazwa ulicy z numerem: </label>
    <input type="text" id="street" placeholder="ulica"/>
    <br>
    <label for="numberstreet">Nr domu/lokalu: </label>
    <input type="number" id="numberstreet" placeholder="podaj numer"/>
    <br>
    <label for="postal_code">Kod pocztowy: </label>
    <input type="text" id="postal_code" placeholder="podaj kod pocztowy"/>
    <br>

    <label for="email">email: </label>
    <input type="text" id="email" placeholder="podaj email"/>
    <br>


    <input type="submit" value="Wyślij"/>
</form>
<%@include file="footer.jsp" %>
</body>
</html>
