package libroejercicios.array;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]num=new int[8];
        for (int i=0;i<num.length;i++){
            System.out.println("introduzca numero "+i);
            num[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println();
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]);
            if(num[i]%2!=0){
                System.out.println(" es un número impar");
            }else{
                System.out.println(" es un número par");
            }
    }
    }
    
}
