package poo.triangulo.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class PrincipalMenu {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        String opcion;
        //crear conexion jdbc
        ConexionMysql cm = new ConexionMysql();
        Connection conexion=cm.getConexion();
        //crear objeto clase CRUD
        Crud crud=new Crud();
        //iniciar menu
        while (true){
        System.out.println("(1) llenar tabla triangulos");
        System.out.println("(2) mostrar tabla triangulos");
        System.out.println("(3) salir");
        System.out.print("escoja opcion");
        opcion=sc.next();
switch(opcion){
    case "1": 
        crud.llenarTablaTriangulo(conexion);
        break;
    case "2": 
        break;
    case "3": 
        System.exit(0);
        break;
    default:
        System.out.println("Opción incorrecta");
        break;
}
    }
    }
    
    
}
