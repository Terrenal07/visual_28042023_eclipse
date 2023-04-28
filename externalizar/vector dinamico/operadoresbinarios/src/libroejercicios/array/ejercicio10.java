package libroejercicios.array;
//se generan 20 numeros al azar, se organizan numeros pares en las primeras posicione e impares en las ultimas
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num=new int[20];
        int[] numo=new int[20];
        int contp=0;
        int conti=1;
        for(int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*100)+1;
            System.out.print("("+num[i]+"),");
            if (i==9){
                System.out.println();
            }
            if (num[i]%2 == 0) {
                numo[contp]=num[i];
                contp++;
            }else{
                numo[numo.length-conti]=num[i];
                conti++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i=0;i<numo.length;i++){
            System.out.print("("+numo[i]+"),");
            if (i==9){
                System.out.println();
            }
        }
        System.out.println();
    }
}
