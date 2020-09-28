<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2020, 12:00:16 PM
    Author     : 562187
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action = "age" method = "post">
            Enter your age: <input type = "text" name = "yourAge">
            <br>
            <input type = "submit" value = "Age next birthday">
            </form>
            ${message}
            <br>
            <a href ="arithmetic">Arithmetic Calculator</a>   
    </body>
</html>
