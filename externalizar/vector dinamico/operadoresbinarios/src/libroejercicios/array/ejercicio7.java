package libroejercicios.array;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numa,numb;
        int[] num=new int[100];
        for(int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*100)+1;
            System.out.print("("+num[i]+"),");
        }
        System.out.println();
        System.out.print("defina dos numeros para sustituir el primero por el segundo");
        System.out.println("se indicará en numero cambiado marcandolo entre comillas");
        System.out.println("introduzca primer numero: ");
        numa = sc.nextInt();
        System.out.println("introduzca segundo numero: ");
        numb = sc.nextInt();
        System.out.println();
        for(int i=0;i<num.length;i++){
            if (num[i]==numa){
                num[i]=numb;
                System.out.print("''("+num[i]+"),''");
            }else{
                System.out.print("("+num[i]+"),");
            }
        }
        System.out.println();
    }
    
}
