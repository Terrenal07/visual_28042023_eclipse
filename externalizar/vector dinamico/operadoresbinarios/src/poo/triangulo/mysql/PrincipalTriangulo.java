package poo.triangulo.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import triangulo.Triangulo;

public class PrincipalTriangulo {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/bdgeometria";
        String usuario="root";
        String clave="";
        Connection conexion;
        int id;
        conexion = DriverManager.getConnection(url, usuario, clave);
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
        //select
        ps=conexion.prepareStatement(query2);
        ResultSet rs=ps.executeQuery();
        Triangulo.cabecera();
        while (rs.next()){
        id=rs.getInt(1);
        double base=rs.getDouble(2);
        double altura=rs.getDouble(3);
        Triangulo1 t=new Triangulo1(id,base,altura);
        t.imprimirDetalles(id);
        }
        }else{
            System.out.println("Sin conexion");
    }
    }
    
}
