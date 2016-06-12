<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 11/06/2016
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="services" class="pe.edu.utp.hrserviceapp.models.ServiceBean" scope="session"/>
<html>
<head>
    <title>.:: Countries Count ::.</title>
</head>
<body>
    <p>Countries Count: <jsp:getProperty name="services" property="countriesCount"/></p>

</body>
</html>
