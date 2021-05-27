<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/27/2021
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, String> dictionary = new HashMap<>();
    dictionary.put("hello", "Xin chào");
    dictionary.put("how", "Thế nào");
    dictionary.put("book", "Quyển vở");
    dictionary.put("computer", "Máy tính");
    String search = request.getParameter("inputWord");
    String result = dictionary.get(search);
    if (result != null) {
        out.println("<h1>Word: " + search+"<h1>");
        out.println("<h1>Result: " + result+"<h1>");
    } else {
        out.println("Not found");
    }
%>
</body>
</html>
