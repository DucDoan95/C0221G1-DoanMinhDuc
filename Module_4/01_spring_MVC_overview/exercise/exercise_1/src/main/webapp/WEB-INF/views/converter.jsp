<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 6/15/2021
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Currency Converter</h3>
<form action="/converterUSD" method="post">
    <p>USD</p>
    <input type="number" name="inputUSD" value="${usd}" step="any">
    <p>VND</p>
    <input type="text" name="outputVND" readonly value="${converterResult}">
    </br>
    </br>
    <button type="submit">Converter</button>
</form>
</body>
</html>
