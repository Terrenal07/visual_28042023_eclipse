<%-- 
    Document   : ejercicio1
    Created on : 22-may-2023, 11:39:09
    Author     : curso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>matriz con datos</title>
    </head>
    <body>
        <%
        int nul=-499;
        int[][]matriz=new int[3][6];
         for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = nul;
        }
    }
        matriz[0][0]=0;
        matriz[0][1]=30;
        matriz[0][2]=2;
        matriz[0][5]=5;
        matriz[1][0]=75;
        matriz[1][4]=0;
        matriz[2][2]=-2;
        matriz[2][3]=9;
        matriz[2][5]=11;
        %>

<style>
    table {
        border-collapse: collapse;
        width: 60%;
        background-color: #A6B4C0;
    }

    th, td {
        border: 2px solid black;
        padding: 8px;
        text-align: center;
    }
</style>

<table style="border-collapse: collapse;">
    <%
        for (int i = 0; i < matriz.length; i++) {
            %>
            <tr>
            <% for (int j = 0; j < matriz[i].length; j++) { %>
                <td>
                    <% if (matriz[i][j] != nul) { %>
                        <%= matriz[i][j] %>
                    <% } %>
                </td>
            <% } %>
            </tr>
            <%
        }
    %>
</table>
    </body>
</html>
<%--http://localhost:8080/PROYECTOWEB/ejercicios/ejercicio1.jsp--%>