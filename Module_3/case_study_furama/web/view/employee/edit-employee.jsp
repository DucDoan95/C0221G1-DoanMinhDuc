<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/30/2021
  Time: 2:01 PM
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

        input {
            width: 85%;
        }
    </style>
</head>
<body>
<div class="container-fluid col-lg-12">
    <nav class="navbar navbar-expand-lg navbar-light">
        <a class="navbar-brand" href="/"><img class="mb-1" src="../../img/icon.png" style="width: auto;height: 2.5rem"/></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item dropdown px-4">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Customer
                    </a>
                    <div class="dropdown-menu bg-light" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="../../view/customer/list-customer.jsp">List Customer</a>
                        <a class="dropdown-item" href="../../view/customer/create-customer.jsp">Create Customer</a>
                        <a class="dropdown-item" href="../../view/customer/edit-customer.jsp">Edit Customer</a>
                        <a class="dropdown-item" href="../customer/view-customer.jsp">Delete Customer</a>
                    </div>
                </li>
                <li class="nav-item dropdown px-4">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown-1" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Employee
                    </a>
                    <div class="dropdown-menu bg-light" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="../../view/employee/list-employee.jsp">List Employee </a>
                        <a class="dropdown-item" href="../../view/employee/create-employee.jsp">Create Employee </a>
                        <a class="dropdown-item" href="../../view/employee/edit-employee.jsp">Edit Employee </a>
                        <a class="dropdown-item" href="../../view/employee/delete-employee.jsp">Delete Employee </a>
                    </div>
                </li>
                <li class="nav-item dropdown px-4">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown-2" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Service
                    </a>
                    <div class="dropdown-menu bg-light" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="../../view/service/list-service.jsp">List Service</a>
                        <a class="dropdown-item" href="../../view/service/create-service.jsp">Create Service</a>
                        <a class="dropdown-item" href="../../view/service/edit-service.jsp">Edit Service</a>
                        <a class="dropdown-item" href="../../view/service/delete-service.jsp">Delete Service</a>
                    </div>
                </li>
                <li class="nav-item dropdown px-4">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown-3" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Contract
                    </a>
                    <div class="dropdown-menu bg-light" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="../../view/contract/list-contract.jsp">List Contract</a>
                        <a class="dropdown-item" href="../../view/contract/create-contract.jsp">Create Contract</a>
                        <a class="dropdown-item" href="../../view/contract/edit-contract.jsp">Edit Contract</a>
                        <a class="dropdown-item" href="../../view/contract/delete-contract.jsp">Delete Contract</a>
                    </div>
                </li>
                <li class="nav-item dropdown px-4">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown-4" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Contract Detail
                    </a>
                    <div class="dropdown-menu bg-light" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="../../view/contract_detail/list-contract-detail.jsp">List
                            Contract Detail</a>
                        <a class="dropdown-item" href="../../view/contract_detail/create-contract-detail.jsp">Create
                            Contract Detail</a>
                        <a class="dropdown-item" href="../../view/contract_detail/edit-contract-detail.jsp">Edit
                            Contract Detail</a>
                        <a class="dropdown-item" href="../../view/contract_detail/delete-contract-detail.jsp">Delete
                            Contract Detail</a>
                    </div>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>

<div class="container">
    <form method="post">
        <div class=" row">
            <div class="col-lg-2"></div>
            <div class="col-lg-8 bg-info">
                <div class="row p-3 bg-light">
                    <div class="col-lg-12 text-center">
                        <h1>Edit Employee</h1>
                        <c:if test="${message=='Edit successful'}">
                            <p class="text-success">${message}</p>
                        </c:if>
                        <c:if test="${message=='Edit unsuccessful'}">
                            <p class="text-danger">${message}</p>
                        </c:if>
                    </div>
                </div>
                <div class="row bg-light">
                    <div class="col-lg-12 w-100 p-0 m-0">
                        <a class="btn btn-success" href="/employee"> < Back to List</a>
                    </div>
                </div>
                <div class="row p-2 pt-5">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Name</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeeName" value="${employee.employeeName}">
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Birthday</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="date" name="employeeBirthday" value="${employee.employeeBirthday}">
                    </div>
                </div>

                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee ID Card</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeeIDCard" value="${employee.employeeIDCard}">
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Salary</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeeSalary" value="${employee.employeeSalary}">
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Phone</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeePhone" value="${employee.employeePhone}">
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Email</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeeEmail" value="${employee.employeeEmail}">
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Address</label>
                    </div>
                    <div class="col-lg-8">
                        <input type="text" name="employeeAddress" value="${employee.employeeAddress}">
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Position ID</label>
                    </div>
                    <div class="col-lg-8">
                        <select class="form-select w-auto" aria-label="Default select example" name="positionID"
                                value="${employee.positionID}">
                            <option value="1">Receptionist</option>
                            <option value="2">Service</option>
                            <option value="3">Specialist</option>
                            <option value="4">Supervisor</option>
                            <option value="5">Director</option>
                            <option hidden value="${employee.positionID}" selected>
                                <c:if test="${employee.positionID == 1}">
                                    Receptionist
                                </c:if>
                                <c:if test="${employee.positionID ==2}">
                                    Service
                                </c:if>
                                <c:if test="${employee.positionID ==3}">
                                    Specialist
                                </c:if>
                                <c:if test="${employee.positionID ==4}">
                                    Supervisor
                                </c:if>
                                <c:if test="${employee.positionID ==5}">
                                    Director
                                </c:if>
                            </option>
                        </select>
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Education ID</label>
                    </div>
                    <div class="col-lg-8">
                        <select class="form-select w-auto" aria-label="Default select example" name="educationDegreeID"
                                value="${employee.educationDegreeID}">
                            <option value="1">Intermediate</option>
                            <option value="2">College</option>
                            <option value="3">University</option>
                            <option value="4">Graduate</option>
                            <option hidden value="${employee.educationDegreeID}" selected>
                                <c:if test="${employee.educationDegreeID == 1}">
                                    Intermediate
                                </c:if>
                                <c:if test="${employee.educationDegreeID ==2}">
                                    College
                                </c:if>
                                <c:if test="${employee.educationDegreeID ==3}">
                                    University
                                </c:if>
                                <c:if test="${employee.educationDegreeID ==4}">
                                    Graduate
                                </c:if>
                            </option>
                        </select>
                    </div>
                </div>
                <div class="row p-2">
                    <div class="col-lg-4 text-right">
                        <label class="font-weight-bold">Employee Division ID</label>
                    </div>
                    <div class="col-lg-8">
                        <select class="form-select w-auto" aria-label="Default select example" name="divisionID"
                                value="${employee.divisionID}">
                            <option value="1">Sales-Marketing Department</option>
                            <option value="2">Administrative Department</option>
                            <option value="3">Service Department</option>
                            <option value="4">Management Department</option>
                            <option hidden value="${employee.divisionID}" selected>
                                <c:if test="${employee.divisionID == 1}">
                                    Sales-Marketing Department
                                </c:if>
                                <c:if test="${employee.divisionID ==2}">
                                    Administrative Department
                                </c:if>
                                <c:if test="${employee.divisionID ==3}">
                                    Service Department
                                </c:if>
                                <c:if test="${employee.divisionID ==4}">
                                    Management Department
                                </c:if>
                            </option>
                        </select></div>
                </div>
                <div class="row p-2 align-items-center">
                    <div class="col-lg-4 col-md-4 col-sm-4 "></div>
                    <div class="col-lg-4 col-md-4 col-sm-4 ">
                        <input class="btn btn-success" type="submit" id="submit" value="Edit Employee"
                               style="width: 200px">
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xl-4"></div>

                </div>
            </div>
            <div class="col-lg-2"></div>

        </div>
    </form>
</div>
<div class="container-fluid">
    <div class="row text-center p-4">
        <div class="col-lg-12">
            <p>Copyright © 2018 Furama Hotels International. All Rights Reserved.</p>
        </div>
    </div>
</div>
</body>
</html>


