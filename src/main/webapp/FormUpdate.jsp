
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="http://localhost:8080/student?action=update&id=${id}" method="post">
    <input type="text" name="name" placeholder="name" value="${student.name}">
    <input type="text" name="dateOfBirth" placeholder="dateOfBirth" value="${student.DateOfBirth}">
    <input type="text" name="address" placeholder="address" value="${student.address}">
    <input type="text" name="phoneNumber" placeholder="phone" value="${student.phoneNumber}">
    <input type="text" name="email" placeholder="email" value="${student.email}">
    <input type="text" name="classRoom" placeholder="classroomId" value="${student.ClassRoom}">
    <button type="submit">Submit</button>
</form>
</body>
</html>
