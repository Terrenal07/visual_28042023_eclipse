package hasmap;

import archivo_csv.transacciones;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class main3 {

    public static void main(String[] args) {
        Map<Integer, transacciones> mapaTransacciones = new HashMap<>();
        int salida;
        CallableStatement cs;
        String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String pass = "";
        Connection conexion = null;
        String query = "CALL mostrar();";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conexion = DriverManager.getConnection(url, usuario, pass);
            if (conexion != null) {
                int u = 0;
                ps = conexion.prepareCall(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    if (u == 4) {
                        u = 0;
                    }
                    int idTransaccion = rs.getInt("idTransaccion");
                    String ciudad = rs.getString("ciudad");
                    String zona = rs.getString("zona");
                    Double ventas = rs.getDouble("ventas");
                    String formaPago = rs.getString("formaPago");
                    String categoria = rs.getString("categoria");
                    transacciones t = new transacciones(idTransaccion, ciudad, zona, ventas, formaPago, categoria);
                    mapaTransacciones.put(idTransaccion, t);
                }
            } else {
                System.out.println("error conexion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Integer, transacciones> entry : mapaTransacciones.entrySet()) {
            int key = entry.getKey();
            transacciones value = entry.getValue();
            System.out.println("Clave: " + key + ", Valor: " + value);
        }
    }

}
