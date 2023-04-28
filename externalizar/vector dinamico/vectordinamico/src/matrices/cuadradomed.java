package matrices;
import java.util.Scanner;
public class cuadradomed {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //datos
        int alt,bas;
        //entrada
        System.out.println("Altura deseada: ");
        alt=sc.nextInt();
        System.out.println("Base deseada: ");
        bas=sc.nextInt();
        //proceso
        //salida
        if(alt<2){
            for(int i=0;i<bas;i++){
                System.out.print(" * ");
            }
            System.out.println();
        }else{
            for(int i=0;i<1;i++){
            for(int j=0;j<bas;j++){
            System.out.print(" * ");
            }
            System.out.println();
        }
            if (bas<2){
                for(int i=1;i<alt;i++){
                System.out.println(" * ");  
                }
            }else{
            for(int i=0;i<alt-2;i++){
            System.out.print(" * ");
            for(int j=0;j<bas-2;j++){
            System.out.print("   ");
            }
            System.out.print(" * ");//ultimo central
            System.out.println();
        }
            }
        for(int i=0;i<1;i++){
            for(int j=0;j<bas;j++){
            System.out.print(" * ");
            }
            System.out.println();
        }
        }
        
        
    }
    
}
