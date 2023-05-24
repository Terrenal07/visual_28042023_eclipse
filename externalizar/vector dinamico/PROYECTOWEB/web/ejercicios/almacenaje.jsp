<%-- 
    Document   : almacenaje
    Created on : 24-may-2023, 14:19:17
    Author     : curso
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>COMBOBOX ALUMNOS</h1>
    <%
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/instituto";
    String user = "root";
    String password = "";
    Connection conexion = null;
    String opcion = request.getParameter("lista");
    try {
        conexion = DriverManager.getConnection(url, user, password);
        String query = "SELECT idAlumno FROM Alumno";
        PreparedStatement ps = conexion.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        %>
        <form>
        <select name='lista' onchange='this.form.submit()'>
        <%
        while (rs.next()) {
            int idAlumno = rs.getInt("idAlumno");
            if (opcion.equals(String.valueOf(idAlumno))) {
                out.print("<option value='" + idAlumno + "' selected>" + idAlumno + "</option>");
            } else {
                out.print("<option value='" + idAlumno + "'>" + idAlumno + "</option>");
            }
        }
        %>
        </select>
        </form>
        <%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
    if (opcion != null) {
        try {
            String queryDatos = "SELECT nombre, edad, estatura FROM Alumno WHERE idAlumno = ?";
            PreparedStatement psDatos = conexion.prepareStatement(queryDatos);
            psDatos.setString(1, opcion);
            ResultSet rsDatos = psDatos.executeQuery();
            if (rsDatos.next()) {
                String nombre = rsDatos.getString("nombre");
                int edad = rsDatos.getInt("edad");
                String sedad = edad + " años";
                double estatura = rsDatos.getDouble("estatura");
                String sestatura = estatura + " m";
    %>
                <style>
    .form-group {
        display: inline-block;
        margin-bottom: 1px;
    }

    .form-group label {
        display: block;
    }
                </style>
<form>
<div class="form-group">
    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" value="<%= nombre %>" size="4">
</div>

<div class="form-group">
    <label for="edad">Edad:</label>
    <input type="text" name="edad" value="<%= edad %>" size="4">
</div>

<div class="form-group">
    <label for="estatura">Estatura:</label>
    <input type="text" name="estatura" value="<%= sestatura %>" size="4">
</div>
<input type="submit" name="modificar" value="modificar"/>
</form>
<%
            }
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
    if (request.getParameter("modificar") != null) {
        try {
            int opcion2=Integer.parseInt(request.getParameter("lista"));
            String queryDatos = "UPDATE Alumno SET nombre=?, edad=?, estatura=? WHERE idAlumno=?";
            PreparedStatement psDatos = conexion.prepareStatement(queryDatos);
            String nombre = request.getParameter("nombre");
            String edad = request.getParameter("edad");
            String estatura = request.getParameter("estatura");
            psDatos.setString(1, nombre);
            psDatos.setInt(2, Integer.parseInt(edad));
            psDatos.setDouble(3, Double.parseDouble(estatura));
            psDatos.setInt(4, opcion2);
            int rowsAffected = psDatos.executeUpdate();
            if (rowsAffected > 0) {
                out.println("Los datos del alumno han sido modificados exitosamente.");
            } else {
                out.println("No se pudo modificar los datos del alumno.");
            }
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
    %>
</body>
</html>
