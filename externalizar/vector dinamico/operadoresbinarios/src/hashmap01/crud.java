
package hashmap01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class crud {
    
    public Connection getConexion(){
        String url="jdbc:mysql://localhost:3306/tienda";
        String usuario="root";
        String clave=""; 
        Connection conexion;
        
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
        }catch (Exception e){
            return null;
        }
        return conexion;
    }
    public Map<String,producto>getMapProducto() throws SQLException{
        Map<String,producto>mapa_hm=new HashMap<>();
        Connection conexion = getConexion();
        String query="select*from producto";
        PreparedStatement ps;
        ResultSet rs;
        producto productos;
        if (conexion!=null){
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                String idProducto=rs.getString("idProducto");
                String nombre=rs.getString("nombre");
                double precio=rs.getDouble("precio");
                String cifProveedor=rs.getString("cifProveedor");
                productos=new producto(idProducto,nombre,precio,cifProveedor);
                mapa_hm.put(idProducto, productos);
            }
        }else{
            System.out.println("ERROR: CONEXION");
        }
    return mapa_hm;
    }
}
