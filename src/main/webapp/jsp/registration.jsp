<%--

  Created by IntelliJ IDEA.
  User: Sergey
  Date: 30.09.2017
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link type="text/css" rel="stylesheet" href="${context}/css/loginWindow.css"/>
    <c:set var="context" value="${pageContext.request.contextPath}"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<center>
    <form action="${context}/regNewUser" id="regForm" method="post">
        <%--<br/><font color="red">The Context Path is:<%=request.getContextPath()%>--%>
        <%--</font>--%>
        <br/>Username:<input type="text" name="username">
        <br/>Password:<input style="margin-top: 10px" type="password" name="password">
    </form>
    <div id="regButton" class="button">
        Register
    </div>
</center>
</body>
<script src="${context}/js/registration.js"></script>
</html>
