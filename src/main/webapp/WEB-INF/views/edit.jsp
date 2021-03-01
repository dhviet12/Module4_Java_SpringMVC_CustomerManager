<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01-Mar-21
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<a href="/customer/"><h2>Back to Customer list</h2></a>
<h1>Edit Customer information</h1>
<form method="post" >
    <input type="number" name="edit_id" value="${customer.id}">
    <input type="text" name="edit_name" value="${customer.name}">
    <input type="text" name="edit_email" value="${customer.email}">
    <input type="text" name="edit_address" value="${customer.address}">

    <button type="submit">Edit</button>
</form>

</body>
</html>
