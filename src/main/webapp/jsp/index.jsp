<%--
Created by IntelliJ IDEA.
User: Sergey
Date: 29.09.2017
Time: 18:45
To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login page</title>
    <%--<base href="${pageContext.request.contextPath}">--%>
    <%--<jsp:include page="css/loginWindow.css"/>--%>
    <%--<link rel="stylesheet" type="text/css" href="css/loginWindow.css">--%>
    <c:set var="context" value="${pageContext.request.contextPath}"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/jsp/css/loginWindow.css"/>
</head>
<body>
<center>
    <h1>Login page</h1>
    <h2>Signup Details</h2>
    <div id="buttons">


    </div>
    <form action="${pageContext.request.contextPath}/checkLogin" method="post">
        <br/><font color="red">The Context Path is:<%=request.getContextPath()%>
    </font>
        <br/>Username1111111:<input type="text" name="username">
        <br/>Password:<input style="margin-top: 10px" type="password" name="password">


        <br/><input style="margin-top: 10px" type="submit" value="Submit">
    </form>
    <a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>
</center>
</body>
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