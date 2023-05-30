package procedimientoAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args) {
        int salida;
        CallableStatement cs;
        String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String pass = "";
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, pass)) {
            cs = conexion.prepareCall("{CALL contar(?)}");
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.execute();
            salida = cs.getInt(1);
            System.out.println("\nNúmero de registros: " + salida);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
