import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]tmp=new int[12];
        for (int i=0;i<tmp.length;i++){
            System.out.println("Introduzca temperatura el mes "+(i+1)+": ");
            tmp[i] = sc.nextInt();
        }
        for(int i=0;i<tmp.length;i++){
            System.out.println("Grafico temperatura mes "+(i+1)+":");
            do {
                if(tmp[i]>0){
                    System.out.print("*");
                    tmp[i]--;
                }else{
                    System.out.println();
                    break;
                }
            }while(true);
        }
    }
}