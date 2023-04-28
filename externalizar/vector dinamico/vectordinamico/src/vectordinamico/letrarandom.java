package vectordinamico;
import java.util.Scanner;
public class letrarandom {
    public static void main(String[] args) {
    //datos
    int n=0;
    char l;
    char []ls;
    //entrada
    Scanner sc=new Scanner (System.in);
    System.out.print ("ingrese tamaño vector:");
    n=sc.nextInt();
    ls=new char[n];
    //proceso
    for(int i=0;i<n;i++){
        ls[i]=(char)(int)(Math.random()*27+64);
    }
    //salida
    for(int i=0;i<n;i++){
        System.out.println("pos: "+i+" contiene: "+ls[i]+" numero: "+(int)ls[i]);
    }
    }
}


