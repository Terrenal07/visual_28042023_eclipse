<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <script>
        function submitForm() {
            document.getElementById("myForm").submit();
        }
    </script>
</head>
<body>
    <h1>COMBOBOX CON EL IDALUMNO</h1>
<style>
    .redondo {
        width: 75px;
        height: 75px;
        border: 2px solid black;
        border-radius: 0px;
    }
</style>
    <%
        // CONEXION
        String url = "jdbc:mysql://127.0.0.1:3306/instituto2";
        String usuario = "root";
        String clave = "";
        Connection conexion = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, usuario, clave);
        // PROCESAR LA ACCION DEL BOTON
        String idAlumno = "";
        String nombre = "";
        String edad = "";
        String estatura = "";
        String ruta="";
        int fot=-1;
        if (request.getParameter("idAlumno") != null) {
            try {
                fot=0;
                idAlumno = request.getParameter("idAlumno").trim();
                String query1 = "SELECT * FROM Alumno WHERE idAlumno = ?";
                PreparedStatement ps1 = conexion.prepareStatement(query1);
                ps1.setInt(1, Integer.parseInt(idAlumno));
                ResultSet rs1 = ps1.executeQuery();
                while (rs1.next()) {
                    nombre = rs1.getString("nombre");
                    edad = rs1.getInt("edad") + "";
                    estatura = rs1.getDouble("estatura") + "";
                    String imagen=rs1.getString("imagen");
                    ruta = request.getContextPath() + "/imagenes/archivos/" + imagen;
                }
            } catch (Exception e) {
                nombre = "ERROR";
            }
        }
        if (request.getParameter("actualizar") != null) {
            idAlumno = request.getParameter("idAlumno");
            nombre = request.getParameter("nombre");
            edad = request.getParameter("edad");
            estatura = request.getParameter("estatura");
            String query = "UPDATE Alumno SET nombre = ?, edad = ?, estatura = ? WHERE idAlumno = ?";
            PreparedStatement ps2 = conexion.prepareStatement(query);
            ps2.setString(1, nombre);
            ps2.setInt(2, Integer.parseInt(edad));
            ps2.setDouble(3, Double.parseDouble(estatura));
            ps2.setInt(4, Integer.parseInt(idAlumno));
            ps2.executeUpdate();
        }
    %>
    <!-- PINTAR EL FORMULARIO -->
    <%
        String query = "SELECT idAlumno FROM Alumno";
        PreparedStatement ps = conexion.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
    %>
    <form id="myForm" action="">
        <div style="display: flex; justify-content: center;">
        <select name="idAlumno" onchange="submitForm()">
            <%
                while (rs.next()) {
                    int idAlumno1 = rs.getInt("idAlumno");
                    if (idAlumno.equalsIgnoreCase(idAlumno1 + "")) {
                        out.print("<option selected='true' value='" + idAlumno1 + "'>" + idAlumno1 + "</option>");
                    } else {
                        out.print("<option value='" + idAlumno1 + "'>" + idAlumno1 + "</option>");
                    }
                }
            %>
        </select>
        <div style="display: flex; justify-content: center;">
        <input type="text" name="nombre" value="<%=nombre%>" placeholder="NOMBRE"/>
        <input type="text" name="edad" value="<%=edad%>" placeholder="EDAD"/>
        <input type="text" name="estatura" value="<%=estatura%>" placeholder="ESTATURA"/>
        <%
            if (fot != -1) {
        %>
        <img class="redondo" src="<%= ruta%>">
        <%
            }
        %>
        <input type="submit" name="actualizar" value="ACTUALIZAR" />
        <br><br><br>
    
</div>
    </form>
</body>
</html>