<%--
  Created by IntelliJ IDEA.
  User: Павло
  Date: 03.08.2017
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>All solved equations</title>
  </head>
  <body>
    <c:forEach items="${equationsList}" var="equation" >
      <c:out value="${equation.a}"></c:out> * x^2 + <c:out value="${equation.b}"></c:out> * x + <c:out value="${equation.c}"></c:out> = 0   result: x1 = ${equation.x1} x2 = ${equation.x2}</br>
    </c:forEach>
  </body>
</html>
