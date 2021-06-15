<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 6/15/2021
  Time: 5:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form method="post" action="/save">
    <input name="condiment" type="checkbox" value="Lettuce" />Lettuce
    <input name="condiment" type="checkbox" value="Tomato" />Tomato
    <input name="condiment" type="checkbox" value="Mustard" />Mustard
    <input name="condiment" type="checkbox" value="Sprouts" />Sprouts
    <br>
    <button type="submit">Submit</button>
</form>
<h4 style="color: red">${condiment}</h4>
</body>
</html>
