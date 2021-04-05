<%-- 
    Document   : testImg
    Created on : Jan 16, 2021, 6:23:39 PM
    Author     : Luong Thanh Ha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Test Img</h1>
        <form action="MainController" enctype="multipart/form-data" method="POST">
            <img src="data:image/png;base64,${requestScope.data}"/>
            <h1>${requestScope.imageData}</h1>
<!--            <input
                type="text"
                name="username"
                placeholder="Username"
                pattern="[a-z]{1,15}"
                title="Username should only contain lowercase letters. e.g. john"/><br/>
            <input
                type="text"
                name="lastname"
                placeholder="Lastname"
                pattern="[a-z]{1,15}"
                title="Username should only contain lowercase letters. e.g. john"/>-->
            
        </form>

    </body>
</html>
