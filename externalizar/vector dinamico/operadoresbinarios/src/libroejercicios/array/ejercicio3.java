package libroejercicios.array;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num=new int [10];
        for (int i=0;i<num.length;i++){
            System.out.println("introduzca numero en pos "+i+": ");
            num[i] = sc.nextInt();
        }
        for (int a=num.length-1;a>=0;a--){
            System.out.print("("+num[a]+"),");
        }
        System.out.println();
        
    }
    
}
