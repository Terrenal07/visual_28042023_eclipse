<%-- 
    Document   : botonredondo
    Created on : 24-may-2023, 9:58:58
    Author     : curso
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .operation-button {
                display: inline-block;
                width: 50px;
                height: 50px;
                border-radius: 50%;
                text-align: center;
                line-height: 50px;
                margin: 5px;
                cursor: pointer;
            }
        </style>
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
                        try {
                            scalc = String.valueOf(Double.parseDouble(sn1) + Double.parseDouble(sn2));
                        } catch (NumberFormatException e) {
                            scalc = "novalue";
                        }
                        break;
                    case "resta":
                        try {
                        scalc = String.valueOf(Double.parseDouble(sn1) - Double.parseDouble(sn2));
                        } catch (NumberFormatException e) {
                            scalc = "novalue";
                        }
                        break;
                    case "multiplicacion":
                    try {
                        scalc = String.valueOf(Double.parseDouble(sn1) * Double.parseDouble(sn2));
                        } catch (NumberFormatException e) {
                            scalc = "novalue";
                        }
                        break;
                    case "division":
                    try {
                        scalc = String.valueOf(Double.parseDouble(sn1) / Double.parseDouble(sn2));
                        } catch (NumberFormatException e) {
                            scalc = "novalue";
                        }
                        break;
                    case "potencia":
                    try {
                        scalc = String.valueOf(Math.pow(Double.parseDouble(sn1), Double.parseDouble(sn2)));
                        } catch (NumberFormatException e) {
                            scalc = "novalue";
                        }
                        break;
                }
            }
        %>
        
        <h1>botones redondos</h1>
        
        <form method="POST">
            <div>
                <input type="radio" name="calculo" id="suma" value="suma" <% if (calculo.equals("suma")) { %>checked<% } %>>
                <label for="suma" class="operation-button">suma</label>
                <br>
                <input type="radio" name="calculo" id="resta" value="resta" <% if (calculo.equals("resta")) { %>checked<% } %>>
                <label for="resta" class="operation-button">resta</label>
            <br>
                <input type="radio" name="calculo" id="multiplicacion" value="multiplicacion" <% if (calculo.equals("multiplicacion")) { %>checked<% } %>>
                <label for="multiplicacion" class="operation-button">multiplicacion</label>
            <br>
                <input type="radio" name="calculo" id="division" value="division" <% if (calculo.equals("division")) { %>checked<% } %>>
                <label for="division" class="operation-button">division</label>
            <br>
                <input type="radio" name="calculo" id="potencia" value="potencia" <% if (calculo.equals("potencia")) { %>checked<% } %>>
                <label for="potencia" class="operation-button">potencia</label>
            </div>
            
            <input type="text" name="sn1" value="<%= sn1 %>" placeholder="numero 1" size="4">
            <input type="text" name="sn2" value="<%= sn2 %>" placeholder="numero 2" size="4">
            
            <input type="text" name="scalc" value="<%= scalc %>" placeholder="solucion" size="4" disabled>
            
            <input type="submit" name="scalc" value="Calcular">
        </form>
    </body>
</html>
