package vectordinamico;
import java.util.Scanner;
public class faltacons {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//datos
        int[]alf=new int[26];
        int n =0;
        char l;
//entrada
        System.out.print("numero de letras: ");
        n=sc.nextInt();
//proceso
       for(int i=0;i<n;i++){
            l=(char)(int)(Math.random()*26+65);
            System.out.print(l+" ");
            alf[l-65]=1;
        } 
//salida
System.out.println(" ");
System.out.println("No han salido las siguientes letras");
        for (int i=0;i<26;i++){
            if (alf[i]<1){
                System.out.print((char)(i+65)+" ");
            }
        }
    System.out.println(" ");
        }
    }