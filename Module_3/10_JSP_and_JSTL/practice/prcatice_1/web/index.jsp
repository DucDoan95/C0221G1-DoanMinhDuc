<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/27/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="converter.jsp" method="post">
    <h1>Currency Converter</h1>
    <label>Rate:</label>
    <input type="text" name="inputRate" value="0">
    <label>USD:</label>
    <input type="text" name="usd">
<input type="submit" id="submit" value="Converter" >
</form>
</body>
</html>
