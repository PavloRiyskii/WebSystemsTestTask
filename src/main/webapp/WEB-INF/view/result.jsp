<%--
  Created by IntelliJ IDEA.
  User: Павло
  Date: 03.08.2017
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>result</title>
  </head>
    The result is.....</br>
    x1 = ${x1} </br>
    x2 = ${x2} </br>
    <form action="http://localhost:8080/websystems/equation">
        <input type="submit" value="New equation">
    </form>
    <form action="http://localhost:8080/websystems/allequations">
      <input type="submit" value="All previous equations">
    </form>

  </body>
</html>
