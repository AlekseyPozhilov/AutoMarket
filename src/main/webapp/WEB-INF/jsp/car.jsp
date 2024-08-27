<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <title>Car Details</title>
</head>
<body>
<jsp:include page="navbar.jsp" />
<c:set var="car" value="${cars[carId]}" />
<h1>Details of Car: <c:out value="${car.brand} ${car.model}" /></h1>

<table>
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>Id</td>
        <td><c:out value="${car.id}" /></td>
    </tr>
    <tr>
        <td>Brand</td>
        <td><c:out value="${car.brand}" /></td>
    </tr>
    <tr>
        <td>Model</td>
        <td><c:out value="${car.model}" /></td>
    </tr>
    <tr>
        <td>Year Of Publishing</td>
        <td><c:out value="${car.yearOfPublishing}" /></td>
    </tr>
    <tr>
        <td>Country Of Origin</td>
        <td><c:out value="${car.countryOfOrigin}" /></td>
    </tr>
    <tr>
        <td>Horse Power</td>
        <td><c:out value="${car.horsePower}" /></td>
    </tr>
    <tr>
        <td>Color</td>
        <td><c:out value="${car.color}" /></td>
    </tr>
    <tr>
        <td>Price</td>
        <td><c:out value="${car.price}" /></td>
    </tr>
</table>

<a href="/cars/edit/${car.id}">Edit</a> |
<form action="/cars/delete/${car.id}" method="post" style="display:inline;">
    <input type="submit" value="Delete">
</form>
<br>
<a href="/cars">Back to list</a>
</body>
</html>