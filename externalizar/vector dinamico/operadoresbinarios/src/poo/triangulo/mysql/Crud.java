package poo.triangulo.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {
    public void llenarTablaTriangulo(Connection conexion) throws SQLException{
        PreparedStatement ps=null;
        String query="INSERT INTO triangulo(base,altura) Values(?,?)";
        String query2="Select * from triangulo";
        if (conexion !=null){
            //insert
        ps=conexion.prepareStatement(query);
        for (int i=0;i<100;i++){
            ps.setDouble(1,Math.random()*10+1);
            ps.setDouble(2,Math.random()*10+1);
            ps.executeUpdate();
            System.out.println("triangulo generado");
        }
        }else{
            System.out.println("Sin conexion");
    }
}
}
