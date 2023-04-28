<%-- 
    Document   : fecha
    Created on : 22-may-2023, 11:13:14
    Author     : curso
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>fecha del sistema</h1>
        <%
            Date d=new Date();
            String today=DateFormat.getDateInstance().format(d);
            String[] parte=today.split("-");
            out.println("fecha: "+d);
            String fecha=parte[0]+" de "+parte[1]+" de "+parte[2];
        %>
        DIA<input type='text' value="<%=parte[0]%>"style="text-align:center;width: 50px;"/>
        MES<input type='text' value="<%=parte[1]%>"style="text-align:center;width: 50px;"/>
        AÑO<input type='text' value="<%=parte[2]%>"style="text-align:center;width: 50px;"/>
        FECHA <input type='text' value="<%=fecha%>"style="text-align:center;width: 200px;"/>
    </body>
</html>
<%--http://localhost:8080/PROYECTOWEB/ejercicios/fecha.jsp--%>