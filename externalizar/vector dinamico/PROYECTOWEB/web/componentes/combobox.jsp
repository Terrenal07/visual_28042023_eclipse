<%-- 
    Document   : combobox
    Created on : 24-may-2023, 9:09:42
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
        <% 
            String solucion = "";
            String calculo = "";
            String sn1 = "";
            String sn2 = "";
            String scalc = "";
            
            if (request.getMethod().equals("POST")) {
                calculo = request.getParameter("calculo");
                sn1 = request.getParameter("sn1");
                sn2 = request.getParameter("sn2");
                
                switch (calculo) {
                    case "suma":
                        scalc = String.valueOf(Double.parseDouble(sn1) + Double.parseDouble(sn2));
                        break;
                    case "resta":
                        scalc = String.valueOf(Double.parseDouble(sn1) - Double.parseDouble(sn2));
                        break;
                    case "multiplicacion":
                        scalc = String.valueOf(Double.parseDouble(sn1) * Double.parseDouble(sn2));
                        break;
                    case "division":
                        scalc = String.valueOf(Double.parseDouble(sn1) / Double.parseDouble(sn2));
                        break;
                    case "potencia":
                        scalc = String.valueOf(Math.pow(Double.parseDouble(sn1), Double.parseDouble(sn2)));
                        break;
                }
            }
        %>
        
        <h1>COMBOBOX (LISTA DESPLEGABLE)</h1>
        
        <form method="POST">
            <select name='calculo' size='1'>
                <option>suma</option>
                <option>resta</option>
                <option>multiplicacion</option>
                <option>division</option>
                <option>potencia</option>
            </select>
            <br>
            <br>
            <input type="text" name="sn1" value="<%= sn1 %>" placeholder="numero 1" size="4">
            <input type="text" name="sn2" value="<%= sn2 %>" placeholder="numero 2" size="4">
            
            <input type="text" name="scalc" value="<%= scalc %>" placeholder="solucion" size="4" disabled>
            
            <input type="submit" name="scalc" value="Calcular">
        </form>
    </body>
</html>