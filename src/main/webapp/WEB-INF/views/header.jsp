<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 10.04.2021
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
   <nav class="navbar" style="background-color: #000000;">
<table class="header-table">
    <tr>
        <td>
            <a class="navbar-link" href="<c:url value="/main_page"/>">Strona główna</a>
        </td>
        <td>
            <a class="navbar-link" href="<c:url value="/order_page"/>">Zamów płytę</a>
        </td>

        <td>
            <a class="navbar-link" href="<c:url value="/description"/>">Opis płyty</a>
        </td>

        <td>
            <a  class="navbar-link" href="<c:url value="/contact_page"/>">Kontakt</a>
        </td>

    </tr>
</table>
   </nav>
</header>