<%-- 
    Document   : agecalculator
    Created on : 21-Sep-2022, 9:45:04 PM
    Author     : paulh
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
        <form method="post" action="AgeCalculator">
            Current Age: <input type="number" name="currentage"><br>
            <input type="submit" name="submitbutton" value="Age Next Birthday"><br>
        </form>
        ${result}
        ${message}
        <br>
        <a href="ArithmeticCalculator">Arithmetic Calculator</a>
        
    </body>
</html>
