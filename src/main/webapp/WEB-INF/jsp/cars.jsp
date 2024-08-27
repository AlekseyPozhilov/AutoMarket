<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <title>Cars</title>
</head>
<body>
<jsp:include page="navbar.jsp" />
<h1>All Cars</h1>
<table>
    <tr>
        <th>#</th>
        <th>Id</th>
        <th>Brand</th>
        <th>Model</th>
        <th>Year Of Publishing</th>
        <th>Country Of Origin</th>
        <th>Horse Power</th>
        <th>Color</th>
        <th>Price</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${cars}" var="car" varStatus="counter">
        <tr>
            <td><c:out value="${counter.count}" /></td>
            <td><c:out value="${car.id}" /></td>
            <td><c:out value="${car.brand}" /></td>
            <td><c:out value="${car.model}" /></td>
            <td><c:out value="${car.yearOfPublishing}" /></td>
            <td><c:out value="${car.countryOfOrigin}" /></td>
            <td><c:out value="${car.horsePower}" /></td>
            <td><c:out value="${car.color}" /></td>
            <td><c:out value="${car.price}" /></td>
            <td>
                <form action="/cars/edit/${car.id}" method="get">
                    <input type="submit" value="Edit">
                </form>
            </td>
            <td>
                <form action="/cars/delete/${car.id}" method="post">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>