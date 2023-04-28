package vectordinamico;

import java.util.Scanner;

public class Vectordinamico {
    public static void main(String[] args) {
    //datos
    int n=0;
    int[]x;
    //entrada
    Scanner sc=new Scanner (System.in);
    System.out.print ("ingrese tamaño vector:");
    n=sc.nextInt();
    x=new int[n];
    //proceso
    for(int i=0;i<n;i++){
        System.out.println("pos " + i + ":");
        x[i]=sc.nextInt();
    }
    //salida
    for(int i=0;i<n;i++){
        System.out.println("pos: "+i+" contiene: "+x[i]);
    }
    }
    
}
