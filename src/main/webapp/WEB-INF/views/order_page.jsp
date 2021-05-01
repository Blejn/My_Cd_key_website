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
<body style="background-color: cornflowerblue">
<%@include file="header.jsp" %>
<form:form method="post" modelAttribute="customer">
    <br>
    <p>
    Imię:
    <br>
    <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error" element="p"/>
    <br>
    </p>
    <p>
    Nazwisko:
    <br>
    <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error" element="p"/>
    <br>
    </p>
    <p>
    Województwo:
    <br>
    <form:select items="${voivodeships}" path="voivodeship"/>
    <form:errors path="voivodeship" cssClass="error" element="p"/>
    <br>
    </p>
    <p>
    Miasto:
    <br>
    <form:input path="city"/>
    <form:errors path="city" cssClass="error" element="p"/>
    <br>
    </p>
    <p>
    Ulica(nazwa i numer)
    <br>

    <form:input path="street"/>
    <form:errors path="street" cssClass="error" element="p"/>
    <br>
    </p>
    <p>
    Numer telefonu:
    <br>
    <form:input path="number"/>
    <form:errors path="number" cssClass="error" element="p"/>
    <br>
    </p>
    <p>
    Kod pocztowy:
    <br>
    <form:input path="postal_code"/>
    <form:errors path="postal_code" cssClass="error" element="p"/>
    <br>
    </p>
    <p>
    Email:
    <br>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error" element="p"/>

    </p>
    <p>
    <br>
    <input type="submit" value="Wyślij"/>
    </p>
</form:form>


<%@include file="footer.jsp" %>
</body>
</html>
