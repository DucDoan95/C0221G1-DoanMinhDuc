<%--
  Created by IntelliJ IDEA.
  User: DmD
  Date: 6/9/2021
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../lib/bootstrap-4.6.0-dist/css/bootstrap.css">
</head>
<body>
<div class="container mt-3">
    <div class="row">
        <div class="col-lg-12">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="text-center"><a class="text-dark text-decoration-none" href="/employee">Employee List</a> </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-9 col-md-8 col-sm-6 col-6 m-0">
                    <h1 class="text-left m-0 p-0">
                        <a class="btn btn-success btnCreate" href="/employee?action=create">Create</a>
                    </h1>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-6 m-0">
                    <form class="d-flex m-0 p-0" method="get" action="/employee">
                        <input name="action" value="search" hidden>
                        <input class="form-control me-2" type="text" name="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success ml-2" type="submit">Search</button>
                    </form>
                </div>
            </div>
            <table class="table table-striped table-bordered" id="tableEmployee">
                <thead>
                <tr class="text-center">
                    <th>STT</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Birthday</th>
                    <th>View</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employee}" var="employeee" varStatus="status">
                    <tr class="text-center">
                        <td>${status.count}</td>
                        <td>${employeee.employeeID}</td>
                        <td>${employeee.employeeName}</td>
                        <td>${employeee.employeeBirthday}</td>
                        <td>
                            <button type="button" class="btn btn-info"
                                    onclick="sendDataToModalView('${employeee.employeeID}','${employeee.employeeName}','${employeee.employeeBirthday}')"
                                    data-toggle="modal" data-target="#exampleModalLongView">
                                View
                            </button>
                        </td>
                        <td>
                            <a class="btn btn-warning" href="employee?action=edit&employeeID=${employeee.employeeID}">Edit</a>
                        </td>
                        <td>
                            <button type="button" class="btn btn-danger"
                                    onclick="sendDataToModalDelete('${employeee.employeeID}','${employeee.employeeName}')"
                                    data-toggle="modal" data-target="#exampleModalLongDelete">
                                Delete
                            </button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
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
                        Employee</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body text-center">
                    <input hidden type="text" name="employeeID" id="idEmployeeDelete">
                    <p>Do you want to delete Employee: </p>
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
                    <div class="col-lg-4 text-right">
                        <p>Employee ID: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="idEmployeeView"></span>
                    </div>
                </div>
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
                        <p>Employee Birthday: </p>
                    </div>
                    <div class="col-lg-8">
                        <span id="birthdayEmployeeView"></span>
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
    function sendDataToModalView(id, name, birthday) {
        document.getElementById("idEmployeeView").innerText = id;
        document.getElementById("nameEmployeeView").innerText = name;
        document.getElementById("birthdayEmployeeView").innerText = birthday;
    }
</script>

<script src="../../lib/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="../../lib/bootstrap-4.6.0-dist/js/bootstrap.bundle.js"></script>
<script src="../../lib/datatables/js/jquery.dataTables.min.js"></script>
<script src="../../lib/datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5,
        });
    });
</script>

</body>
</html>
