<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
        <title>Edit user</title>
    </head>
<body>
    <jsp:include page="navbar.jsp"/>
    <h1>Edit user</h1>
    <form method="post" action="/users/edit/${user.id}">

        <label for = "firstName-input">FIRST NAME:</label>
                <input id = "firstName-input" name = "firstName" type = "text" required value="${user.firstName}"/>
                <br/>
        <label for="email-input">EMAIL: </label>
                <input id="email-input" name="email" type="email" required value="${user.email}"/>
                <br/>
        <label for="password-input">PASSWORD: </label>
                <input id="password-input" name="password" type="password" required value="${user.password}"/>
                <br/>

       <input type="submit" value="SAVE">
    </form>
</body>
</html>