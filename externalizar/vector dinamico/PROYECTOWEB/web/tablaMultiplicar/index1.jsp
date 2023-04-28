<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    int j=0,i=0;
    int n = 2;
    for (i = n; i < 13; i++) {
        for (j = 1; j < 13; j++) {
        }
        if (i < 12) {
        }
    }
        %>
<input type="text" value=<%=i%>>
<input type="text" value="x"/>
<input type="text" value=<%=j%>>
<input type="text" value="="/>
<input type="text" value=<%=i*j%>>
<br>
    </body>
</html>
<%--http://localhost:8080/PROYECTOWEB/tablaMultiplicar/index1.jsp--%>