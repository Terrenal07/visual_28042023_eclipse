
package procedimientoAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main5 {
    public static void main(String[] args) {
        int salida;
        CallableStatement cs;
        String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String pass = "";
        Connection conexion=null;
        String query="CALL contarmax();";
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            conexion = DriverManager.getConnection(url, usuario, pass);
            if (conexion!=null){
                ps=conexion.prepareCall(query);
                rs=ps.executeQuery();
                System.out.println("+-------------------+-------------------+");
                System.out.printf("|%19s|%19s|%n","categoria", "ventas");
                System.out.println("+-------------------+-------------------+");
                while(rs.next()){
                    String categoria=rs.getString("categoria");
                    Double ventas=rs.getDouble("ventas");
                    System.out.printf("|%19s|%19.2f|%n", categoria,ventas);
                    
                }
                System.out.println("+-------------------+-------------------+");
            }else{
                System.out.println("error conexion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
