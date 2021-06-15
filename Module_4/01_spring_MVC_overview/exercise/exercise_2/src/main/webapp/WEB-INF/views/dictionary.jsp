<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 6/15/2021
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dictionary</h2>
<form action="/translateVietnamese" method="post">
    <label>English</label>
    <input type="text" name="inputEnglish">
    </br>
    </br>
    <label>Vietnamese</label>
    <input type="text" name="outputVietnamese" value="${resultVietnamese}" readonly>
    <br>
    <br>
    <button type="submit">Translate</button>
</form>
</body>
</html>
