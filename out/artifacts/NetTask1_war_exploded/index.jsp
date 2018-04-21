<%--
  Created by IntelliJ IDEA.
  User: black
  Date: 2018/4/21
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>小窗口</title>
  </head>
  <body>
    <center>
        <form action="<%=request.getContextPath()%>/html" method="POST">
            <input type="submit" value="提交">
        </form>
    </center>
  </body>
</html>
