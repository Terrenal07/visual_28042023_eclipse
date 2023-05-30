package archivo_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class migrar {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Ventas";
        String user = "root";
        String pass = "";
        Connection conexion = null;
        List<transacciones> listaTransacciones = new ArrayList<transacciones>();
        String nra = "data\\transacciones.csv";
        String fila = "";
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            String query = "CREATE TABLE Transaccion (\n" +
                    "idTransaccion INT PRIMARY KEY AUTO_INCREMENT,\n" +
                    "ciudad VARCHAR(25) NOT NULL,\n" +
                    "zona VARCHAR(25) NOT NULL,\n" +
                    "ventas DOUBLE NOT NULL,\n" +
                    "formaPago VARCHAR(25) NOT NULL,\n" +
                    "categoria VARCHAR(25) NOT NULL\n" +
                    ")ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            while ((fila = br.readLine()) != null) {
                String[] partes = fila.split(";");
                if (i != 0) {
                    transacciones t = new transacciones(Integer.parseInt(partes[0]),
                            partes[1],
                            partes[2],
                            Double.parseDouble(partes[3]),
                            partes[4],
                            partes[5]);
                    listaTransacciones.add(t);
                }
                i++;
            }
            if (!listaTransacciones.isEmpty()) {
                conexion = DriverManager.getConnection(url, user, pass);
                String query = "INSERT INTO Transaccion (ciudad, zona, ventas, formaPago, categoria) " +
                        "VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = conexion.prepareStatement(query);
                for (transacciones t : listaTransacciones) {
                    ps.setString(1, t.getCIUDAD());
                    ps.setString(2, t.getZONA());
                    ps.setDouble(3, t.getVENTAS());
                    ps.setString(4, t.getFORMA_PAGO());
                    ps.setString(5, t.getCATEGORIA());
                    ps.executeUpdate();
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR ARCHIVO: " + e.getMessage());
        }
    }
}