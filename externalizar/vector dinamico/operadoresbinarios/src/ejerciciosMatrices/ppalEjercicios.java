package ejerciciosMatrices;

import java.util.Scanner;

public class ppalEjercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            utiles.limpiarpantalla();
            System.out.println("Ejercicios Matrices");
            System.out.println();
            System.out.println("1: Ejercicio 1 - Llenar array con datos determinados y mostrar matriz");
            System.out.println("2: Ejercicio 2");
            System.out.println("14: Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamar al método correspondiente al Ejercicio 1
                    utiles.limpiarpantalla();
                    ejercicios matriz = new ejercicios(); // Creas una instancia de la clase
                    int[][] resultadoEjercicio1 = matriz.ejercicio1(); // Llamas al método y guardas el resultado en una variable
                    utiles.imprimirMatrizInt(resultadoEjercicio1); // Imprimes la matriz resultante
                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine(); // Leer la línea vacía (Enter)
                    scanner.nextLine();
                    break;
                case 2:
                    utiles.limpiarpantalla();
                    ejercicios matriz2 = new ejercicios(); // Creas una instancia de la clase QUEDA ARREGLAR MUCHAS COSITAS
                    int[][] resultadoEjercicio2 = matriz2.ejercicio2(); // Llamas al método y guardas el resultado en una variable
                    utiles.imprimirMatrizInt(resultadoEjercicio2); // Imprimes la matriz resultante
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 3:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 4:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 5:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 6:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 7:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 8:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 9:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 10:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 11:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 12:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 13:
                    // Llamar al método correspondiente al Ejercicio 2
                    break;
                case 14:
                    // Salir del programa
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        }
    }
}
