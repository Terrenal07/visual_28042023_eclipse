package pooalumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException {
        int id=1;
        String url="jdbc:mysql://localhost:3306/alumnos";
        String usuario="root";
        String clave="";
        Connection conexion;
        conexion = DriverManager.getConnection(url, usuario, clave);
        PreparedStatement ps=null;
        String query="INSERT INTO alumnos(nombre,apellido,edad,nota_media) VALUES(?,?,?,?)";
        String query2="SELECT * FROM alumnos";
        if (conexion !=null){
            //insert
            //select
            ps=conexion.prepareStatement(query2);
            ResultSet rs=ps.executeQuery();
            alumnos.cabecera();
            while (rs.next()){
                String nombre=rs.getString(2);
                String apellido=rs.getString(3);
                int edad=rs.getInt(4);
                double nota_media=rs.getDouble(5);
                alumnos t=new alumnos(id,nombre,apellido,edad,nota_media);
                t.imprimirDetalles(id);
                id++;
            }
            alumnos.fin();
        }else{
            System.out.println("Sin conexion");
        }
    }
}