<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/26/2021
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculator" method="post">
    <h1>Product Discount Calculator</h1>
    <label>Product Description</label><br>
    <input type="text" name="description"><br>
    <label>List Price:</label><br>
    <input type="text" name="price"><br>
    <label>Discount Percent:</label><br>
    <input type="text" name="discount"><br>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
