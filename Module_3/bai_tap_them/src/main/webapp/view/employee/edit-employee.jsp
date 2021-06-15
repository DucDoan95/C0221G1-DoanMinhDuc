<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 6/9/2021
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../lib/bootstrap-4.6.0-dist/css/bootstrap.css">
    <style>
        input{
            width: 75%;
        }
    </style>
</head>
<body>
<div class="container">
    <form method="post">
        <div class=" row">
            <div class="col-lg-2"></div>
            <div class="col-lg-8 bg-light">
                <div class="row p-3 bg-white">
                    <div class="col-lg-12 text-center">
                        <h1>Edit Employee</h1>
                        <c:if test="${message=='Edit successful'}">
                            <h4 class="text-success">${message}</h4>
                        </c:if>
                        <c:if test="${message=='Edit unsuccessful'}">
                            <h4 class="text-danger">${message}</h4>
                        </c:if>
                    </div>
                </div>
                <div class="row bg-white">
                    <div class="col-lg-12 w-100 p-0 m-0">
                        <a class="btn btn-success" href="/"> < Back to List</a>
                    </div>
                </div>
                <div class="row p-2 pt-5">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Name</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeeName" value="${employee.employeeName}">
                        <br><small style="color: red">${msgName}</small>
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Birthday</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeeBirthday" value="${employee.employeeBirthday}">
                        <br><small style="color: red">${msgBirthday}</small>
                    </div>
                </div>
                <div class="row p-2 align-items-center">
                    <div class="col-lg-4 col-md-4 col-sm-4 "></div>
                    <div class="col-lg-4 col-md-4 col-sm-4 ">
                        <input class="btn btn-success" type="submit" id="submit" value="Edit Employee"
                               style="width: 150px">
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xl-4"></div>

                </div>
            </div>
            <div class="col-lg-2"></div>

        </div>
    </form>
</div>

<script src="../../lib/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="../../lib/bootstrap-4.6.0-dist/js/bootstrap.bundle.js"></script>
<script src="../../lib/datatables/js/jquery.dataTables.min.js"></script>
<script src="../../lib/datatables/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>
