<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/29/2021
  Time: 12:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1 class="text-center">Product List</h1>
    <h5><a href="/product?action=create">Create Product</a></h5>
    <form method="post" action="/product">
        <input name="action" value="search" hidden>
        <input  type="text" name="search" id="search" placeholder="Input Search">
        <button class="btn btn-success">Search</button>
    </form>


    <table class="table table-striped">
        <tr>
            <th>STT</th>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Price</th>
            <th>Product Description</th>
            <th>Product Manufacture</th>
            <th>Edit</th>
            <th>Delete</th>
            <th>View</th>
        </tr>
        <c:forEach  var ="product" items="${products}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.description}</td>
                <td>${product.manufacture}</td>
                <td><a href="product?action=edit&id=${product.id}">Edit</a></td>
                <td><a href="product?action=delete&id=${product.id}">Delete</a></td>
                <td><a href="product?action=view&id=${product.id}">View</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
