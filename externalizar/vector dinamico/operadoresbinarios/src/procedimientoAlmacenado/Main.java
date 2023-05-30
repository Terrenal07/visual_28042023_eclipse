package procedimientoAlmacenado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String pass = "";
        String query = "CALL mostrar()";
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, pass);
             PreparedStatement ps = conexion.prepareCall(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int idTransaccion = rs.getInt("idTransaccion");
                String ciudad = rs.getString("ciudad");
                System.out.println("idTransaccion: " + idTransaccion + ", ciudad: " + ciudad);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


