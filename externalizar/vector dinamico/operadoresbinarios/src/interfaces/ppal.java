package interfaces;

import ejerciciosMatrices.IOperacionesMatrices;
import ejerciciosMatrices.ejercicios;
import ejerciciosMatrices.utiles;
import java.util.Scanner;

public class ppal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IOperacionesMatrices m=new ejercicios();
        int[][]matriz=m.ejercicio1();
        utiles.imprimirMatrizInt(matriz);
    }
}