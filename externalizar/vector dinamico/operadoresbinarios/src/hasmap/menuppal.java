package hasmap;

import java.util.Map;
import hashmap01.crud;
import hashmap01.producto;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class menuppal {

    static crud crud1 = new crud();
    static Map<String, producto> mapa = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        while (true) {
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("01. CARGAR TABLA PRODCUTO EN UN HASHMAP");
            System.out.println("02. MOSTRAR CONTENIDO DEL HASHMAP");
            System.out.println("03. BUSCAR UN PRODUCTO POR SU CLAVE");
            System.out.println("04. ELIMINAR UN PRODUCTO POR SU CLAVE");
            System.out.println("05. AGREGAR UN PRODUCTO AL HASHMAP");
            System.out.println("06. ACTUALIZAR EL PRECIO DE UN PRODUCTO EN EL HASHMAP");
            System.out.println("07. CANTIDAD DE OBJETOS QUE GUARDA EL HASHMAP");
            System.out.println("08. MOSTRAR EL PRECIO MEDIO ENTRE TODOS LOS PRODUCTOS");
            System.out.println("09. MOSTRAR LOS PRODUCTOS DE UN PROVEEDOR");
            System.out.println("10. MOSTRAR TODOS LOS PRODUCTOS QUE INICIEN CON UNA LETRA DADA");
            System.out.println("11. ELIMINAR LOS PRODUCTOS DE UN PROVEEDOR DADO");
            System.out.println("12. OTRA FORMA DE LA 2");
            System.out.println("13. REMOVER TODOS LOS OBJETOS DEL HASHMAP");
            System.out.println("00. SALIR");
            System.out.print("escoja opcion");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    opcion1();
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "2":
                    opcion1();
                    System.out.println(mapa);
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "3":
                    opcion3();
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "4":
                    // Opción para eliminar un producto por su clave
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "5":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "6":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "7":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    break;
                case "8":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "9":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "10":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "11":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "12":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;

                case "13":
                    // Opción para agregar un producto al HashMap
                    System.out.println("Presiona Enter para continuar...");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static void opcion1() {

        try {
            mapa = crud1.getMapProducto();
        } catch (SQLException ex) {
            Logger.getLogger(menuppal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void opcion3() {
        Map<String, producto> mapa_hm = new HashMap<>();
        try {
            mapa_hm = crud1.getMapProducto();
        } catch (SQLException ex) {
            Logger.getLogger(menuppal.class.getName()).log(Level.SEVERE, null, ex);
        }

        String id;
        System.out.println("Indique id");
        id = sc.nextLine();
        producto productoEncontrado = mapa_hm.get(id);
        if (mapa_hm.containsKey(id)) {
            System.out.println("Tupla encontrada:");
            System.out.println(productoEncontrado);
        } else {
            System.out.println("El ID no coincide con ninguno de los productos en el mapa.");
        }
    }

}
