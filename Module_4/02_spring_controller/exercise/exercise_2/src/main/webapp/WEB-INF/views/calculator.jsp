<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 6/15/2021
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/calculatorNumber" method="post">
    <input type="text" name="inputNumber1" value="${num1}">
    <input type="text" name="inputNumber2" value="${num2}">
    <br>
    <button type="submit" name="button" value="+">Addition(+)</button>
    <button type="submit" name="button" value="-">Subtraction(-)</button>
    <button type="submit" name="button" value="*">Multiplication(*)</button>
    <button type="submit" name="button" value="/">Division(/)</button>
    <br>
    <p style="color: red">${result}</p>
</form>
</body>
</html>
