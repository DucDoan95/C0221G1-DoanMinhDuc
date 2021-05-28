<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/28/2021
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h1>Delete customer</h1>
    <p>
        <a href="/customer">Back to customer list</a>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    </p>
    <form method="post">
        <fieldset>
            <legend>Customer information</legend>
            <table>
                <tr>
                    <td>Id:</td>
                    <td><input disabled type="text" name="id" id="id" value="${customers.id}"></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input disabled type="text" name="name" id="name" value="${customers.name}"></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input disabled type="text" name="email" id="email" value="${customers.email}"></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><input disabled type="text" name="address" id="address" value="${customers.address}"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input class="btn btn-success" type="submit" value="Delete customer"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</div>
</body>

</html>

