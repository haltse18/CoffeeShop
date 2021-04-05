<%-- 
    Document   : errorpage
    Created on : Jan 16, 2021, 11:03:16 PM
    Author     : Luong Thanh Ha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Opps! Somethin' went wrong!</h1>
        <c:set var="err" value="${requestScope.ERROR}"/>
        <font color="red">${err}</font>
    </body>
</html>
