<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h2>There are ${list.size()} customer(s) in list. </h2>

<table border="1" , cellspacing="1" , cellpadding="10">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${list}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.email}</td>
            <td>${c.address}</td>
            <td>
                <a href="/customer/edit/id=${c.id}">Edit</a>
                <a href="/customer/delete/id=${c.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2><a href="/customer/create">Create</a></h2>

</body>
</html>
