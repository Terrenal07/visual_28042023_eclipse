<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina JSP</title>
    </head>
    <body>
        
        <%-- DECLARACIONES--%>
        <%! 
            String titulo="INTRODUCCION JSP";
            public int suma(int n1,int n2){
                return n1+n2;
            }
        %>
        
        <%-- EXPRESIONES--%>
        <h1>
            <%=titulo+" prueba"%>
        </h1>
        
        <%-- SCRIPTLETS--%>
        
        <%
           int n1 = 7;
           int n2 = 6;
           int suma = suma(n1,n2);
           out.println("<h2>suma: <h2><h1>"+suma+"<h1>");
        %>
    </body>
</html>
<%-- 
http://localhost:8080/PROYECTOWEB/introduccionindex.jsp
--%>