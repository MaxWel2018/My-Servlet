<%--
  Created by IntelliJ IDEA.
  User: krugo
  Date: 19.09.2019
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/Style.css">
</head>
<body>

<form action="${pageContext.servletContext.contextPath}/user/create" method="POST">
    <table>
        <tr>
            <td align="right" >Login : </td>
            <td>
                <input type="text" name="login">
            </td>
        </tr>
        <tr>
            <td align="right" >Email : </td>
            <td>
                <input type="text" name="email">
            </td>
        </tr>
        <tr>
            <td><input type="submit" align="center" value="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
