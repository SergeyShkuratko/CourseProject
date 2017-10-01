<%--
Created by IntelliJ IDEA.
User: Sergey
Date: 29.09.2017
Time: 18:45
To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login page</title>
    <%--<base href="${pageContext.request.contextPath}">--%>
    <%--<jsp:include page="css/loginWindow.css"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="css/loginWindow.css">--%>
    <c:set var="context" value="${pageContext.request.contextPath}"/>
    <link type="text/css" rel="stylesheet" href="${context}/css/loginWindow.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>
<center>
    <h1>Login page</h1>
    <form action="${context}/loginCheck" id="loginForm" method="post">
        <%--<br/><font color="red">The Context Path is:<%=request.getContextPath()%>--%>
        <%--</font>--%>
        <br/>Username:<input type="text" name="username">
        <br/>Password:<input style="margin-top: 10px" type="password" name="password">
    </form>
    <div id="buttons">
        <div id="enterButton" class="button">Enter</div>
        <div onclick="location.href='/registration';" id="registrationButton" class="button">Registration</div>
    </div>
    <%--<a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>--%>
</center>
</body>
<script src="${context}/js/loginWindow.js"></script>
</html>
<%--<html>--%>
<%--<head><title>First JSP</title></head>--%>
<%--<body>--%>
<%--<%--%>
<%--double num = Math.random();--%>
<%--if (num > 0.95) {--%>
<%--%>--%>
<%--<h2>You'll have a luck day!</h2>--%>
<%--<p>(<%= num %>)</p>--%>
<%--<%--%>
<%--} else {--%>
<%--%>--%>
<%--<h2>Well, life goes on ... </h2>--%>
<%--<p>(<%= num %>)</p>--%>
<%--<%--%>
<%--}--%>
<%--%>--%>
<%--<a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>--%>
<%--</body>--%>
<%--</html>--%>