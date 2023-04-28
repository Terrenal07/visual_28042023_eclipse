<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>TAMAÑO MATRIZ</title>
</head>
<body>
    <h1>TAMAÑO MATRIZ</h1>
    <%
    String[][] matriz = null;
    int xnum = 0;
    int ynum = 0;
    int mostrarInputs = 0;
    String x = "0";
    String y = "0";
    String estado = "";
    
    if (request.getParameter("accion") != null) {
        mostrarInputs = 0;
        x = request.getParameter("x").trim();
        y = request.getParameter("y").trim();
        if (!x.isEmpty() && !y.isEmpty()) {
            try {
                xnum = Integer.parseInt(x);
                ynum = Integer.parseInt(y);
                matriz = new String[xnum][ynum];
                mostrarInputs = 1; // Desactivar la visualización de los inputs
            } catch (NumberFormatException e) {
                estado = "Entrada incorrecta";
            }
        }
    }
    if (request.getParameter("accion2") != null) {
        mostrarInputs = 1; // Activar la visualización de los inputs después de enviar el formulario
        for (int i = 0; i < xnum; i++) {
            for (int j = 0; j < ynum; j++) {
                String inputName = "input" + i + "_" + j;
                matriz[i][j] = request.getParameter(inputName); // Obtener el valor de cada campo de entrada
            }
        }
        mostrarInputs = 2;
    }
    if (request.getParameter("reiniciar") != null) {
        mostrarInputs = 0;
    }
    %>
    <form action="matrizAMedida.jsp" method="POST">
        <!-- Entradas -->
        <input type="text" name="mostrarInputs" value="<%= mostrarInputs %>"> <!-- Parámetro oculto para mantener el valor de mostrarInputs -->
        <% if (mostrarInputs == 0) { %>
        <h2>Generar matriz</h2>
        <input type="text" name="x" value="" placeholder="columnas" size="4"/> 
        <input type="text" name="y" value="" placeholder="filas" size="4"/> 
        <input type="text" name="estado" value="<%=estado%>" placeholder="estado" disabled> 
        <!-- Acción -->
        <input type="submit" name="accion" value="Calcular">
        <% 
        }
        if (mostrarInputs == 1) { 
        %>
        <h2>Introduzca datos</h2>
        <input type="submit" name="accion2" value="submit">
        <table>
            <% for (int i = 0; i < xnum; i++) { %>
            <tr>
                <% for (int j = 0; j < ynum; j++) {
                    String inputName = "input" + i + "_" + j;
                %>
                <td>
                    <input type="text" name="<%=inputName%>" value="" placeholder="entero" size="3">
                </td>
                <% } %>
            </tr>
            <% } %>
        </table>
        <% 
        } 
        if (mostrarInputs == 2) { 
        %>
        <h2>Datos en matriz</h2>
        <table>
            <% for (int i = 0; i < xnum; i++) { %>
            <tr>
                <% for (int j = 0; j < ynum; j++) {
                    String inputName = "input" + i + "_" + j;
                %>
                <td>
                    <%= matriz[i][j] %>
                </td>
                <% } %>
            </tr>
            <% } %>
        </table>
        <input type="submit" name="reiniciar" value="reiniciar">
        <% } %>
    </form>
</body>
</html>
