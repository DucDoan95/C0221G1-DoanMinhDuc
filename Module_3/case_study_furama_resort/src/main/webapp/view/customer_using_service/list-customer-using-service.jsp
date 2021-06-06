<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 6/6/2021
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Furama Resort</title>
    <script src="../../lib/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="../../lib/bootstrap-4.6.0-dist/css/bootstrap.css">
    <script src="../../lib/bootstrap-4.6.0-dist/js/bootstrap.bundle.js"></script>
    <style>
        img {
            width: 20%;
            height: 80%;
        }

        .container-fluid .row {
            height: 10%;
        }

        .table .btn {
            width: 60px;
            height: 35px;
        }

    </style>
</head>
<body>
<jsp:include page="../../view/furama/furama-header.jsp"></jsp:include>
<div class="container mt-3">
    <div class="row">
        <div class="col-lg-12">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="text-center">Customer Using Service List</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-9 col-md-8 col-sm-6 col-6 m-0">
                    <h1 class="text-left m-0 p-0">
                        <a class="btn btn-success btnCreate" href="../../view/furama/furama.jsp">Back to Home</a>
                    </h1>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-6 m-0">
                    <form class="d-flex m-0 p-0" method="get" action="/customer">
                        <input name="action" value="search" hidden>
                        <input class="form-control me-2" type="text" name="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success ml-2" type="submit">Search</button>
                    </form>
                </div>
            </div>

            <table class="table table-striped">
                <tr class="text-center">
                    <th>STT</th>
                    <th>CustomerID</th>
                    <th>Customer Name</th>
                    <th>Contract ID</th>
                    <th>Contract Start Date</th>
                    <th>Contract End Date</th>
                    <th>Service Name</th>
                    <th>Attach Service Name</th>
                    <th>Quantity</th>
                </tr>
                <c:forEach items="${customerUsingServiceList}" var="customerUsingService" varStatus="status">
                    <tr class="text-center">
                        <td>${status.count}</td>
                        <td>${customerUsingService.customerID}</td>
                        <td>${customerUsingService.customerName}</td>
                        <td>${customerUsingService.contractID}</td>
                        <td>${customerUsingService.contractStartDate}</td>
                        <td>${customerUsingService.contractEndDate}</td>
                        <td>${customerUsingService.serviceName}</td>
                        <td>${customerUsingService.attachServiceName}</td>
                        <td>${customerUsingService.quantity}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<jsp:include page="../../view/furama/furama-footer.jsp"></jsp:include>

</body>
</html>

