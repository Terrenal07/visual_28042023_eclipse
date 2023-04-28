<%-- 
    Document   : calculo
    Created on : 22-may-2023, 13:35:36
    Author     : curso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>SUMAR DOS NÚMEROS</h1>
    
    <% 
    String n1 = "0";
    String n2 = "0";
    String mensaje = "";
    String resultado = "0";

    if (request.getParameter("accion") != null) {
        if (!n1.isEmpty() && !n2.isEmpty()) {
            try {
                n1 = request.getParameter("n1").trim();
                n2 = request.getParameter("n2").trim();
                int suma = Integer.parseInt(n1) + Integer.parseInt(n2);
                resultado = String.valueOf(suma);
            } catch (Exception e) {
                resultado = "Entrada incorrecta";
            }
        }
    }
    %>
    <form action="calculo.jsp" method="POST">
        <!-- Entradas -->
        <input type="text" name="n1" value="<%=n1%>" placeholder="Número 1" size="4"/>
        <input type="text" name="n2" value="<%=n2%>" placeholder="Número 2"size="4">
        
        <!-- Salida -->
        <input type="text" value="<%=resultado%>" placeholder="Resultado" disabled/>
        
        <!-- Acción -->
        <input type="submit" name="accion" value="Calcular">
    </form>
</body>

</html>
