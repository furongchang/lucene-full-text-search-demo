<%--
  Created by IntelliJ IDEA.
  User: 付荣畅
  Date: 2022/1/14
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String result=(String) request.getAttribute("result");%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>success</h1>
<table>
    <tr>
        <td><%=result%></td>
    </tr>
</table>

</body>
</html>
