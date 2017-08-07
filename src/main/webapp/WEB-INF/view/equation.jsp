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
    <title>Equation</title>
  </head>
  <body>
    <form name="foo" action="http://localhost:8080/websystems/calculate" method="get">
      <input type ="text" id="a" name="a"> * x ^2 + <input type ="text" id="b" name="b"> * x + <input type ="text" id="c" name="c"> = 0 </br>
      <input type="submit" value="calculate">
    </form>
  </body>
</html>
