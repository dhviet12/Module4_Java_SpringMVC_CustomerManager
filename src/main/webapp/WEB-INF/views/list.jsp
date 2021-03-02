<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h1><a href="/customer">List Customer</a></h1>
<br>

<table border="1" , cellspacing="0" , cellpadding="10">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${list}" var="c">
        <tr>
            <td>${c.name}</td>
            <td>${c.email}</td>
            <td>${c.address}</td>
            <td>
                <a href="/customer/edit/${c.id}">Edit</a>
                <a href="/customer/delete/${c.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<form method="post">
    <input type="text" placeholder="enter name's product" name="search">
    <input type="submit" value="search">
</form>


<h2><a href="/customer/create">Create</a></h2>

</body>
</html>
