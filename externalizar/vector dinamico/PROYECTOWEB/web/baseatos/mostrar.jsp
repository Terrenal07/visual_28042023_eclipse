<%-- 
    Documento: mostrar.jsp
    Creado en: 23-may-2023, 10:36:14
    Autor: curso
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página JSP</title>
    </head>
    <body>
        <h1>Mostrar todos los registros de la tabla</h1>
        <% // Comprueba si se ha enviado el parámetro "accion"
            int id = 0;
            String url = "jdbc:mysql://localhost:3306/instituto";
            String usuario = "root";
            String clave = "";
            String query = "";
            int idAlumno = 0;
            String nombre = "";
            int edad = 0;
            double altura = 0;
            Connection conexion = null;
            if (request.getParameter("accion") != null) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conexion = DriverManager.getConnection(url, usuario, clave);
                    query = "SELECT * FROM alumno";
                    PreparedStatement ps = conexion.prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        idAlumno = rs.getInt(1);
                        nombre = rs.getString(2);
                        edad = rs.getInt(3);
                        altura = rs.getDouble(4);
        %>
        <input type="text" value="<%=idAlumno%>" placeholder="id" disabled/>
        <input type="text" value="<%=nombre%>" placeholder="nombre"  disabled/>
        <input type="text" value="<%=edad%>" placeholder="edad"  disabled/>
        <input type="text" value="<%=altura%>" placeholder="altura"  disabled/>
        <% 
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Cierra la conexión
                    if (conexion != null) {
                        try {
                            conexion.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        if (request.getParameter("accion2") != null && request.getParameter("id") != null) {
            try {
                id = Integer.parseInt(request.getParameter("id"));
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, clave);
                query = "SELECT * FROM alumno WHERE idAlumno="+id;
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    idAlumno = rs.getInt(1);
                    nombre = rs.getString(2);
                    edad = rs.getInt(3);
                    altura = rs.getDouble(4);
                        %>
                        <input type="text" value="<%=idAlumno%>" placeholder="id" disabled/>
                        <input type="text" value="<%=nombre%>" placeholder="nombre"  disabled/>
                        <input type="text" value="<%=edad%>" placeholder="edad"  disabled/>
                        <input type="text" value="<%=altura%>" placeholder="altura"  disabled/>
                        <% 
                } else {
        %>
        <p>No se encontró ningún registro con el ID especificado.</p>
        <% 
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Cierra la conexión
                if (conexion != null) {
                    try {
                        conexion.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        %>
        <form>
            <input type="submit" name="accion" value="Mostrar">
            <br>
            <br>
            <input type="submit" name="accion2" value="Buscar por ID">
            <input type="text" name="id" value="" placeholder="ID">
        </form>
    </body>
</html>
