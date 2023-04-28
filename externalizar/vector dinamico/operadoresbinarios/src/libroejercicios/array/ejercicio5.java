package libroejercicios.array;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num=new int [10];
        int val=0;
        for (int i=0;i<num.length;i++){
            System.out.println("introduzca numero en pos "+i+": ");
            num[i] = sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if (val>num[i]){
                
            }else{
                val=num[i];
            }
        }
        System.out.println("valor maximo: "+val);
        for(int i=0;i<num.length;i++){
            if (val<num[i]){
                
            }else{
                val=num[i];
            }
        }
        System.out.println("valor minimo: "+val);
    }
    
}
