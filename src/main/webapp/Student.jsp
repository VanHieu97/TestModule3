<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/6/2023
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<!doctype html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <meta name="viewport"--%>
<%--          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="ie=edge">--%>
<%--    <title>Document</title>--%>
<%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"--%>
<%--          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"--%>
<%--            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"--%>
<%--            crossorigin="anonymous"></script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"--%>
<%--            integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"--%>
<%--            crossorigin="anonymous"></script>--%>
<%--    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"--%>
<%--          integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="--%>
<%--          crossorigin="anonymous" referrerpolicy="no-referrer"/>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form action="http://localhost:8080/student?action=search" method="post">--%>
<%--    <input type="text" name="search" placeholder="Tìm kiếm Sinh Viên"></th>--%>
<%--    <button type="submit">Tìm</button>--%>
<%--</form>--%>
<%--<table border>--%>
<%--    <th>STT</th>--%>
<%--    <th>Name</th>--%>
<%--    <th>DateOfBirth</th>--%>
<%--    <th>Email</th>--%>
<%--    <th>Address</th>--%>
<%--    <th>Phone</th>--%>
<%--    <th>Classroom</th>--%>
<%--    <th>Action</th>--%>
<%--    <th><a href="http://localhost:8080/student?action=add">--%>
<%--        <button>ADD</button>--%>
<%--    </a></th>--%>
<%--    <c:forEach var="val" items="${student}">--%>
<%--        <tr>--%>
<%--            <td>${val.getId()}</td>--%>
<%--            <td>${val.getName()}</td>--%>
<%--            <td>${val.getEmail()}</td>--%>
<%--            <td>${val.getDateOfBirth()}</td>--%>
<%--            <td>${val.getAddress()}</td>--%>
<%--            <td>${val.getPhoneNumber()}</td>--%>
<%--            <td>${val.getClassRoom()}</td>--%>
<%--            <td><a href="http://localhost:8080/student?action=update&id=${val.id}"><button>Edit</button></a></td>--%>
<%--            <td><button onclick="del(${val.id})">Delete</button></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--<script>--%>
<%--    function del(id) {--%>
<%--        let a = confirm("Bạn Thực Sự Muốn Xóa!")--%>
<%--        if (a) {--%>
<%--            document.location.href="http://localhost:8080/student?action=delete&id="+id;--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show All Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
    <h2> List Student</h2>
    <div class="d-flex">
        <a  class="float-left" href="/student?action=add"><button class="btn btn-info">Add</button></a></th>
        <form class="form-inline float-right" action="http://localhost:8080/student?action=search" method="post">
            <input hidden="hidden" name="action" value="search">
            <div class="form-group mb-2">
                <label for="staticEmail2" class="sr-only">Search</label>
                <input type="text" class="form-control-plaintext" id="staticEmail2" name="search" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-primary mb-2">Search</button>
        </form>
    </div>
    <table class="table table-light">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">DateOfBirth</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">Phone</th>
            <th scope="col">Classroom</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="val" items="${student}">
            <tr>
                <td>${val.getId()}</td>
                <td>${val.getName()}</td>
                <td>${val.getEmail()}</td>
                <td>${val.getDateOfBirth()}</td>
                <td>${val.getAddress()}</td>
                <td>${val.getPhoneNumber()}</td>
                <td>${val.getClassRoom()}</td>
                <td><a href="http://localhost:8080/student?action=update&id=${val.id}"><button>Edit</button></a></td>
                <td><button onclick="del(${val.id})">Delete</button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script>
    function del(id) {
        let a = confirm("Bạn Thực Sự Muốn Xóa!")
        if (a) {
            document.location.href="http://localhost:8080/student?action=delete&id="+id;
        }
    }
</script>
</body>
</html>

