<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 5/30/2021
  Time: 2:38 PM
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
                        <a class="dropdown-item" href="/customer">List Customer</a>
                        <a class="dropdown-item" href="/customer?action=create">Create Customer</a>
                    </div>
                </li>
                <li class="nav-item dropdown px-4">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown-1" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Employee
                    </a>
                    <div class="dropdown-menu bg-light" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/employee">List Employee </a>
                        <a class="dropdown-item" href="../../view/employee/create-employee.jsp">Create Employee </a>
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
                    </div>
                </li>
            </ul>
            <form class="d-flex pt-3" method="get" action="/employee">
                <input name="action" value="search" hidden>
                <input class="form-control me-2" type="search" name="search" id="search" placeholder="Search"
                       aria-label="Search">
                <button class="btn btn-outline-success " type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="text-center">Employee List</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="text-right m-0 p-0">
                        <a class="btn btn-success btnCreate" href="/employee?action=create">Create</a>
                    </h1>
                </div>
            </div>
            <table class="table table-striped">
                <tr>
                    <th>STT</th>
                    <th>Name</th>
                    <th>Birthday</th>
                    <th>ID Card</th>
                    <th>Phone</th>
                    <th>View</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                <c:forEach items="${employee}" var="employee" varStatus="status">
                    <tr>
                        <td>${status.count}</td>
                        <td>${employee.employeeName}</td>
                        <td>${employee.employeeBirthday}</td>
                        <td>${employee.employeeIDCard}</td>
                        <td>${employee.employeePhone}</td>
                        <td>
                            <button type="button" class="btn btn-info"
                                    onclick="sendDataToModalView('${employee.employeeID}','${employee.employeeName}','${employee.employeeBirthday}','${employee.employeeIDCard}','${employee.employeeSalary}','${employee.employeePhone}','${employee.employeeEmail}','${employee.employeeAddress}','${employee.positionID}','${employee.educationDegreeID}','${employee.divisionID}')"
                                    data-toggle="modal" data-target="#exampleModalLongView">
                                View
                            </button>
                        </td>
                        <td><a class="btn btn-warning" href="employee?action=edit&employeeID=${employee.employeeID}">Edit</a>
                        </td>
                        <td>
                            <button type="button" class="btn btn-danger"
                                    onclick="sendDataToModalDelete('${employee.employeeID}','${employee.employeeName}')"
                                    data-toggle="modal" data-target="#exampleModalLongDelete">
                                Delete
                            </button>
                        </td>

                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row text-center p-4">
        <div class="col-lg-12">
            <p>Copyright © 2018 Furama Hotels International. All Rights Reserved.</p>
        </div>
    </div>
</div>


<!-- Modal Delete-->
<div class="modal fade" id="exampleModalLongDelete" tabindex="-1" role="dialog"
     aria-labelledby="exampleModalLongTitleDelete"
     aria-hidden="true">
    <form action="/employee?action=delete" method="post">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header center">
                    <h5 class="modal-title text-danger w-100 text-center" id="exampleModalLongTitleDelete">Delete
                        Customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body text-center">
                    <input hidden type="text" name="employeeID" id="idEmployeeDelete">
                    <p>Do you want to delete Customer: </p>
                    <h4 class="text-info"><span id="nameEmployeeDelete"></span></h4>
                </div>
                <div class="modal-footer w-100 justify-content-center">
                    <button type="submit" class="btn btn-primary w-25">Yes</button>
                    <button type="button" class="btn btn-secondary w-25" data-dismiss="modal">No</button>
                </div>
            </div>
        </div>
    </form>
</div>
<script>
    function sendDataToModalDelete(id, name) {
        document.getElementById("idEmployeeDelete").value = id;
        document.getElementById("nameEmployeeDelete").innerText = name
    }
</script>

<!-- Modal View-->
<div class="modal fade" id="exampleModalLongView" tabindex="-1" role="dialog"
     aria-labelledby="exampleModalLongTitleView"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header center">
                <h5 class="modal-title text-danger w-100 text-center" id="exampleModalLongTitleView">
                    Employee Information</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body text-justify">
                <div class="row">
                    <div class="col-lg-4 text-right ">
                        <p>Employee Name: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="nameEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Employee ID: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="idEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Employee Birthday: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="birthdayEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Employee ID Card: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="idCardEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Employee Salary: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="salaryEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Employee Phone: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="phoneEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Employee Email: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="emailEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Employee Address: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="addressEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Position ID: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="positionIDEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Education Degree ID: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="educationDegreeIDEmployeeView"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4 text-right">
                        <p>Division ID: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="divisionIDEmployeeView"></span>
                    </div>
                </div>
            </div>
            <div class="modal-footer w-100 justify-content-center">
                <button type="button" class="btn btn-success w-25" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<script>
    function sendDataToModalView(id, name, birthday, idCard, salary, phone, email, address, positionID, educationDegreeID, divisionID) {
        document.getElementById("idEmployeeView").innerText = id;
        document.getElementById("nameEmployeeView").innerText = name;
        document.getElementById("birthdayEmployeeView").innerText = birthday;
        document.getElementById("idCardEmployeeView").innerText = idCard;
        document.getElementById("salaryEmployeeView").innerText = salary;
        document.getElementById("phoneEmployeeView").innerText = phone;
        document.getElementById("emailEmployeeView").innerText = email;
        document.getElementById("addressEmployeeView").innerText = address;
        document.getElementById("positionIDEmployeeView").innerText = positionID;
        document.getElementById("educationDegreeIDEmployeeView").innerText = educationDegreeID;
        document.getElementById("divisionIDEmployeeView").innerText = divisionID;
    }
</script>
</body>
</html>

