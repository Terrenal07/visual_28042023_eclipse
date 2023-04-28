<%-- 
    Document   : ejercicomatriz
    Created on : 22-may-2023, 13:01:35
    Author     : curso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Matriz Aleatoria</title>
    <style>
    table {
        border-collapse: collapse;
        width: 40%;
        background-color: #A6B4C0;
        border-style:ridge;
    }

    tr, td {
        border: 2px solid black;
        padding: 8px;
        text-align: center;
        border-style:ridge;
    }
</style>
</head>
<body>
    <h1>Matriz Aleatoria</h1>
    <table>
        <%-- Generar la matriz y mostrarla en la tabla --%>
        <% 
            int[][] matriz = new int[6][6];
            java.util.Random random = new java.util.Random();

            for (int i = 0; i < matriz.length; i++) {
                %><tr><%
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = random.nextInt(10) + 1;
                    %><td><%= matriz[i][j] %></td><%
                }
                %></tr><%
            }
        %>
    </table>
</body>
</body>
</html>