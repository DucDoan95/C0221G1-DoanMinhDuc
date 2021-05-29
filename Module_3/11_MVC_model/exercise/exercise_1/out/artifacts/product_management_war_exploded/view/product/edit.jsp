<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/29/2021
  Time: 12:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1>Edit Product</h1>
    <a href="/">Back to list</a>
    <div class="container">
        <c:if test="${message!=null}">
            <p class="text-success">${message}</p>
        </c:if>
        <form method="post">
            <fieldset>
                <legend>Product Information</legend>
                <table>
                    <tr>
                        <td>Id:</td>
                        <td><input  disabled type="text" name="id" id="id" value="${product.id}"></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input  type="text" name="name" id="name" value="${product.name}"></td>
                    </tr>
                    <tr>
                        <td>Price:</td>
                        <td><input  type="text" name="price" id="price" value="${product.price}"></td>
                    </tr>
                    <tr>
                        <td>Description:</td>
                        <td><input  type="text" name="description" id="description" value="${product.description}"></td>
                    </tr>
                    <tr>
                        <td>Manufacture:</td>
                        <td><input  type="text" name="manufacture" id="manufacture" value="${product.manufacture}"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input class="btn btn-success" type="submit" value="Create Product"></td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>
</body>
</html>

