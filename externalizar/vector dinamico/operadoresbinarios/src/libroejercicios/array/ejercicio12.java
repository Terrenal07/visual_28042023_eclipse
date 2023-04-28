
package libroejercicios.array;

import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu=10,cont=0;
        int[] num=new int [nu];
        for (int i=0;i<num.length;i++){
            System.out.println("introduzca numero en pos "+i+": ");
            num[i] = sc.nextInt();
        }
    }
}
