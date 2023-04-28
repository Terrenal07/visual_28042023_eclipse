<%-- 
    Document   : indexmultiplicar
    Created on : 22-may-2023, 9:57:35
    Author     : curso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><center>tabla multiplicar</center></title>
    </head>
    <body>
<%
    int n = 2;
    out.print("<table style=\"border-collapse: collapse;\">");

    for (int i = n; i < 13; i++) {
        out.print("<tr>");

        for (int j = 1; j < 13; j++) {
            out.print("<td style=\"padding: 5px; border: 1px solid black;\">" + i + " x " + j + " = " + (i * j) + "</td>");
        }

        out.print("</tr>");

        // Agregar una línea separadora después de cada conjunto de cálculos
        if (i < 12) {
            out.print("<tr style=\"border-top: 2px solid black;\"><td colspan=\"12\"></td></tr>");
        }
    }

    out.print("</table>");
%>
        <%-- ejemplo tabla 3 columnas y 1 fila
        <table>
            <tr>
                <td>
                    
                </td>
                <td>
                    
                </td>
                <td>
                    
                </td>
            </tr>
        </table>
    </body>
</html>
        --%>
<%-- 
http://localhost:8080/PROYECTOWEB/tablaMultiplicar/indexmultiplicar.jsp
--%>