package vectordinamico;

import java.util.Scanner;

 class cuentavocales {

    public static void main(String[] args) {
    //datos
    String er="[aeiouAEIOU]";//er vocales
    boolean esv=false;
    int n=0; //long vector
    int nv=0;//nº vocales
    char []ls;//vector letras
    String ch="0";//checker
    double mit=n/2;
    //entrada
    Scanner sc=new Scanner (System.in);
    System.out.print ("ingrese tamaño vector:");
    n=sc.nextInt();
    ls=new char[n];
    //proceso
    for(int i=0;i<n;i++){
        ls[i]=(char)(int)(Math.random()*26+65);
        ch=ls[i]+""; 
        esv = ch.matches(er);
        if (esv==true){
           nv=nv+1; 
        }
    }
    //salida
    System.out.println("****************************************");
    for(int i=0;i<n;i++){
        System.out.println("pos: "+i+" contiene: "+ls[i]+" numero: "+(int)ls[i]);
    }
        System.out.println("****************************************");

        if(nv>mit){
            System.out.println("Hay mas vocales que consonantes"); 
        }else{
            System.out.println("Hay mas consonantes que vocales");
        }
    }
}
