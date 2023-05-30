package procedimientoAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main4 {
    public static void main(String[] args) {
        int salida;
        CallableStatement cs;
        String url = "jdbc:mysql://localhost:3306/ventas";
        String usuario = "root";
        String pass = "";
        Connection conexion=null;
        String query="CALL mostrar();";
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            conexion = DriverManager.getConnection(url, usuario, pass);
            if (conexion!=null){
                int u=0;
                ps=conexion.prepareCall(query);
                rs=ps.executeQuery();
                System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+------------------------+");
                System.out.printf("|%19s|%19s|%19s|%19s|%19s|%24s|%n", "idTransaccion"+"  ", "ciudad"+"  ", "zona"+"  ", "ventas"+"  ", "formaPago"+"  ", "categoria"+"  ");
                System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+------------------------+");
                while(rs.next()){
                    if (u==4){
                        System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+------------------------+");
                        u=0;
                    }
                    int idTransaccion=rs.getInt("idTransaccion");
                    String ciudad=rs.getString("ciudad");
                    String zona=rs.getString("zona");
                    Double ventas=rs.getDouble("ventas");
                    String formaPago=rs.getString("formaPago");
                    String categoria=rs.getString("categoria");
                    System.out.printf("|%-19s|%19s|%19s|%19s|%19s|%24s|%n", "  "+idTransaccion, ciudad+"  ",zona+"  ",ventas+"  ",formaPago+"  ", categoria+"  ");
                    u+=+1;
                }
                System.out.println("+-------------------+-------------------+-------------------+-------------------+-------------------+------------------------+");
            }else{
                System.out.println("error conexion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
