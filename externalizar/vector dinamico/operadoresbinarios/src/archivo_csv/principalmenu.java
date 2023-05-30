package archivo_csv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class principalmenu {

    static Scanner sc = new Scanner(System.in);
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String pass = "";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    static String query = "";
    static Connection conexion = null;

    public static void main(String[] args) {
        while (true) {
            System.out.print("\nMENU");
            System.out.print("\n====");
            System.out.print("\n(1) CREAR UNA BASE DE DATOS");
            System.out.print("\n(2) MOSTRAR UN LISTADO DE TODAS LAS BASE DE DATOS QUE EXISTEN");
            System.out.print("\n(3) VERIFICAR SI UNA BASE DE DATOS EXISTE");
            System.out.print("\n(4) ELIMINAR UNA BASE DE DATOS");
            System.out.print("\n(5) CREAR UNA TABLA");
            System.out.print("\n(6) ELIMINAR UNA TABLA");
            System.out.print("\n(7) LLENAR UNA TABLA CON LOS DATOS DE UN ARCHIVO CSV");
            System.out.print("\n(8) MOSTRAR TODOS LOS REGISTROS DE UNA TABLA");
            System.out.print("\n(0) SALIR\n");
            System.out.println("Ingrese opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    opcion1();//funcionando
                    pause();
                    break;
                case 2:
                    opcion2();//funcionando
                    pause();
                    break;
                case 3:
                    opcion3();//funcionando
                    pause();
                    break;
                case 4:
                    opcion4();//funcionando
                    pause();
                    break;
                case 5:
                    opcion5();//funcionando(posibles mejoras necesarias)
                    pause();
                    break;
                case 6:
                    opcion6();
                    pause();
                    break;
                case 7:
                    opcion7();
                    pause();
                    break;
                case 8:
                    opcion8();
                    pause();
                    break;
                case 0:
                    opcion0();//funcionando
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    public static void pause() {
        try {
            System.out.println("\nPresiona cualquier tecla para continuar...");
            System.in.read();
        } catch (Exception e) {

        }
    }

    public static Connection getConexion() {
        try {
            Class.forName(driver);
            Connection conexion = DriverManager.getConnection(url, user, pass);
            return conexion;
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
            return null;
        }
    }

    public static boolean ejecutarQuery(String query, Connection conexion) {
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println();
            return false;
        }
    }

    private static void opcion0() {
        System.exit(0);
    }

    private static void opcion1() {
        System.out.println("-----------------------");
        System.out.println("(1) crear base de datos");
        System.out.println("-----------------------");

        System.out.println("Ingrese nombre de la base de datos:");
        sc.nextLine(); // Consumir el salto de línea pendiente
        String database = sc.nextLine();

        String query = "CREATE DATABASE" + database + ";";
        Connection conexion = getConexion();
        if (ejecutarQuery(query, conexion)) {
            System.out.println("Base de datos creada");
        } else {
            System.out.println("Error: Base de datos no creada");
        }
    }

    private static void opcion2() {
        System.out.println("--------------------------");
        System.out.println("(2) mostrar bases de datos");
        System.out.println("--------------------------");
        String query = "SHOW DATABASES;";
        Connection conexion = getConexion();
        try {
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("-----------------------");
            System.out.println("LISTA DE BASES DE DATOS");
            System.out.println("-----------------------");
            while (resultSet.next()) {
                String databaseName = resultSet.getString(1);
                System.out.println("-" + databaseName);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void opcion3() {
        String exi = "";
        System.out.println("----------------------------");
        System.out.println("(3) comprobar bases de datos");
        System.out.println("----------------------------");
        String query = "SHOW DATABASES;";
        Connection conexion = getConexion();
        System.out.println("Ingrese nombre de la base de datos:");
        sc.nextLine(); // Consumir el salto de línea pendiente
        String database = sc.nextLine();
        try {
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String databaseName = resultSet.getString(1);
                if (databaseName.equals(database)) {
                    exi = "la base da datos " + database + " existe";
                    break;
                } else {
                    exi = "la base da datos " + database + " no existe";
                }
            }
            System.out.println("--------------------------");
            System.out.println(exi);
            System.out.println("--------------------------");
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void opcion4() {
        System.out.println("---------------------------");
        System.out.println("(4) eliminar base de datos");
        System.out.println("--------------------------");

        System.out.println("Ingrese nombre de la base de datos:");
        sc.nextLine(); // Consumir el salto de línea pendiente
        String database = sc.nextLine();

        String query = "DROP DATABASE" + database + ";";
        Connection conexion = getConexion();
        if (ejecutarQuery(query, conexion)) {
            System.out.println("Base de datos eliminada");
        } else {
            System.out.println("Error: Base de datos no eliminada");
        }
    }

    private static void opcion5() {
        boolean pk = false;
        System.out.println("---------------");
        System.out.println("(5) crear tabla");
        System.out.println("---------------");

        System.out.println("Ingrese nombre de la base de datos:");
        sc.nextLine(); // Consumir el salto de línea pendiente
        String database = sc.nextLine();

        String query = "USE `" + database + "`;";

        Connection conexion = getConexion();
        if (conexion != null) {
            try {
                if (ejecutarQuery(query, conexion)) {
                    System.out.println("Base de datos seleccionada");
                    System.out.println("Ingrese nombre de la tabla:");
                    String table = sc.nextLine();
                    while (true) {
                        System.out.println("Ingrese numero de columnas:");
                        String columnum = sc.nextLine();
                        try {
                            int columnunint = Integer.parseInt(columnum);
                            StringBuilder tableQuery = new StringBuilder("CREATE TABLE `" + table + "` (\n");
                            for (int i = 0; i < columnunint; i++) {
                                while (true) {
                                    System.out.println("Indique nombre de la columna " + (i + 1) + ":");
                                    String colnom = sc.nextLine();
                                    while (true) {
                                        System.out.println("Indique tipo de dato (INT/DECIMAL/VARCHAR/TEXT/DATE) de la columna " + (i + 1) + ":");
                                        String dato = sc.nextLine();
                                        try {
                                            switch (dato) {
                                                case "INT":
                                                case "TEXT":
                                                case "DATE":
                                                    tableQuery.append(colnom).append(" ").append(dato);
                                                    if (dato.equals("INT")) {
                                                        while (true) {
                                                            System.out.println("¿autoincremental(Y/N)?:");
                                                            String aut = sc.nextLine();
                                                            if (aut.equals("Y")) {
                                                                tableQuery.append(" AUTO_INCREMENT");
                                                                break;
                                                            } else if (aut.equals("N")) {
                                                                break;
                                                            } else {
                                                                System.out.println("entrada no valida");
                                                            }
                                                        }
                                                        if (!pk) {
                                                            while (true) {
                                                                System.out.println("¿primary key(Y/N)?:");
                                                                String pri = sc.nextLine();
                                                                if (pri.equals("Y")) {
                                                                    tableQuery.append(" PRIMARY KEY");
                                                                    pk = true;
                                                                    break;
                                                                } else if (pri.equals("N")) {
                                                                    break;
                                                                } else {
                                                                    System.out.println("entrada no valida");
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (i == columnunint - 1) {
                                                        tableQuery.append("\n");
                                                    } else {
                                                        tableQuery.append(",\n");
                                                    }
                                                    break;
                                                case "DECIMAL":
                                                    while (true) {
                                                        System.out.println("Indique numero de digitos:");
                                                        String dig = sc.nextLine();
                                                        System.out.println("Indique numero de decimales (menos que cantidad de digitos):");
                                                        String dec = sc.nextLine();
                                                        if (Integer.parseInt(dec) < Integer.parseInt(dig)) {
                                                            tableQuery.append(colnom).append(" ").append(dato).append("(").append(dig).append(", ").append(dec).append(")");
                                                            if (!pk) {
                                                                System.out.println("¿primary key(Y/N)?:");
                                                                String pri = sc.nextLine();
                                                                if (pri.equals("Y")) {
                                                                    tableQuery.append(" PRIMARY KEY");
                                                                    pk = true;
                                                                }
                                                            }
                                                            if (i == columnunint - 1) {
                                                                tableQuery.append("\n");
                                                            } else {
                                                                tableQuery.append(",\n");
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case "VARCHAR":
                                                    while (true) {
                                                        System.out.println("Indique longitud del VARCHAR para la columna " + (i + 1) + ":");
                                                        String longitud = sc.nextLine();
                                                        tableQuery.append(colnom).append(" ").append(dato).append("(").append(longitud).append(")");
                                                        if (i == columnunint - 1) {
                                                            tableQuery.append("\n");
                                                        } else {
                                                            tableQuery.append(",\n");
                                                        }
                                                        break;
                                                    }
                                                    break;

                                                default:
                                                    System.out.println("Tipo de dato no válido");

                                            }
                                            break; // Salir del bucle while
                                        } catch (Exception e) {
                                            System.out.println("Error al crear la columna: " + e.getMessage());
                                            return; // Salir del método en caso de error
                                        }
                                    }
                                    break;
                                }
                            }
                            tableQuery.append(");");
                            if (ejecutarQuery(tableQuery.toString(), conexion)) {
                                System.out.println("Tabla creada");
                            } else {
                                System.out.println("Error: Tabla no creada");
                            }
                            System.out.println("Consulta CREATE TABLE generada:");
                            System.out.println(tableQuery.toString());

                            // Agregar lógica adicional según tus necesidades
                        } catch (NumberFormatException e) {
                            System.out.println("entrada no valida");
                        }
                    }
                } else {
                    System.out.println("Error: Base de datos no encontrada");
                }
            } catch (Exception e) {
                System.out.println("Error de consulta: " + e.getMessage());
            }
        } else {
            System.out.println("Error de conexión con la base de datos");
        }
    }

    private static void opcion6() {
        System.out.println("------------------");
        System.out.println("(6) eliminar tabla");
        System.out.println("------------------");

        System.out.println("Ingrese nombre de la base de datos:");
        sc.nextLine(); // Consumir el salto de línea pendiente
        String database = sc.nextLine();

        String query = "USE `" + database + "`;";
        Connection conexion = getConexion();
        if (ejecutarQuery(query, conexion)) {
            System.out.println("Ingrese nombre de la tabla:");
            String tabla = sc.nextLine();

            query = "DROP TABLE `" + tabla + "`;";
            if (ejecutarQuery(query, conexion)) {
                System.out.println("Tabla eliminada");
            } else {
                System.out.println("Error: No se pudo eliminar la tabla");
            }
        } else {
            System.out.println("base de datos no encontrada");
        }
    }

    private static void opcion7() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void opcion8() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
