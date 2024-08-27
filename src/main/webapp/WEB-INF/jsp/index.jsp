<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CarShowroom</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background: linear-gradient(to right, #f0f4f8, #e0e7ee);
        }

        .container {
            text-align: center;
            max-width: 800px;
            padding: 20px;
            border-radius: 8px;
            background-color: white;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
        }

        h1 {
            font-size: 36px;
            margin-bottom: 20px;
            color: #333;
        }

        p {
            font-size: 18px;
            margin-bottom: 20px;
            color: #555;
        }

        img {
            width: 100%;
            height: auto;
            border-radius: 8px;
            margin-top: 20px;
        }

        footer {
            margin-top: 30px;
            font-size: 14px;
            color: #777;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Automarket!</h1>
        <p>Your dream car awaits you. Explore our exclusive collection of cars!</p>
        <img src="/images/automarket.png" alt="automarket">
    </div>
    <jsp:include page="navbar.jsp" />
    <footer>
        &copy; 2024 CarShowroom | All Rights Reserved
    </footer>
</body>
</html>