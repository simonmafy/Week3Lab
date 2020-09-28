<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2020, 12:03:46 PM
    Author     : 562187
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action = "arithmetic" method = "post">
            First: <input type = "text" name ="first">
            <br>
            Second: <input type = "text" name ="second">
            <br>
            <input type ="submit" name ="add" value ="+">
            <input type ="submit" name ="subtract" value ="-">
            <input type ="submit" name ="multiply" value ="*">
            <input type ="submit" name ="mod" value ="%">
            
            <p>Result: ${result} </p>
            <a href="age">Age Calculator</a>      
        </form>
       
    </body>
</html>
