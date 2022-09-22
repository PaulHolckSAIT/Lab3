<%-- 
    Document   : arithmeticCalculator
    Created on : 22-Sep-2022, 10:11:31 AM
    Author     : paulh
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
        <form method="post" action="ArithmeticCalculator">
            First: <input type="number" name="first"><br>
            Second: <input type="number" name="second"><br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="x">
            <input type="submit" name="operator" value="%">
        </form>
        <br>
        ${result}<br>
        ${message}
        <a href="AgeCalculator">Age Calculator</a>
    </body>
</html>
