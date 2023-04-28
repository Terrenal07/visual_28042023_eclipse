package libroejercicios.array;

import java.util.Scanner;

public class ejercicio6 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num=new int [15];
        int tmp;
        for (int i=0;i<num.length;i++){
            System.out.println("introduzca numero en pos "+i+": ");
            num[i] = sc.nextInt();
        }
        tmp=num[num.length-1];
        for(int i=num.length-1;i>=0;i--){
            if(i-1==0){
            num[i]=num[i-1];
            System.out.println(i);  
            break;
            }
            num[i]=num[i-1];
            System.out.println(i);
        }
        num[0]=tmp;
        System.out.println();
        System.out.println("desplazamiento de datos (1 a la derecha)");
        for(int i=0;i<num.length;i++){
            System.out.print("("+num[i]+"),");
        }
        System.out.println();
    }
}
