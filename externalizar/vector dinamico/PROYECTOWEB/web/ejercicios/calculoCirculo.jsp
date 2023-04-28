<%-- 
    Document   : calculoCirculo
    Created on : 22-may-2023, 14:13:20
    Author     : curso
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
    <h1>CALCULO AREA Y PERIMETRO CIRCULO</h1>
    
    <% 
    String ra = "0";
    String area = "0";
    String perimetro = "0";
    if (request.getParameter("accion") != null) {
        if (!ra.isEmpty()) {
            try {
                ra = request.getParameter("ra").trim();
                double radio = Double.parseDouble(ra);
                double areaDouble = Math.pow(radio, 2) * Math.PI;
                double perimetroDouble = 2 * Math.PI * radio;
                
                // Redondear a 3 decimales
                area = String.valueOf(Math.round(areaDouble * 100.0) / 100.0);
                perimetro = String.valueOf(Math.round(perimetroDouble * 100.0) / 100.0);
            } catch (Exception e) {
                area = "Entrada incorrecta";
                perimetro = "Entrada incorrecta";
            }
        }
    }
    %>
    <form action="calculoCirculo.jsp" method="POST">
        <!-- Entradas -->
        <input type="text" name="ra" value="<%=ra%>" placeholder="radio" size="4"/> 
        <!-- Salida -->
        <label for="area">Área:</label>
        <input type="text" id="area" value="<%=area%>" placeholder="area" disabled/>
        <label for="perimetro">Perímetro:</label>
        <input type="text" id="perimetro" value="<%=perimetro%>" placeholder="perimetro" disabled/>
        <!-- Acción -->
        <input type="submit" name="accion" value="Calcular">
    </form>
</body>
</html>
