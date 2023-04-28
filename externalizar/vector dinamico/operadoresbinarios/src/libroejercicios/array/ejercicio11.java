package libroejercicios.array;
//ejercicio 11 pag 122
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu=10,cont=0;
        int[] num=new int [nu];
        int[] esp=new int [nu];
        int[] ord=new int [nu];
        for (int i=0;i<num.length;i++){
            System.out.println("introduzca numero en pos "+i+": ");
            num[i] = sc.nextInt();
        }
        for (int i=0;i<num.length;i++){
            System.out.println("pos: "+i+"  numero: "+num[i]);
            if (Math.abs(num[i])<=1){
            }else{
                if (Math.abs(num[i])==2){ 
                }else{
                    esp[i]=1;
                    for(int j=2;j<Math.abs(num[i])-1;j++){
                        esp[i]=1;
                        if(Math.abs(num[i])%j==0){
                            esp[i]=0;
                            break; 
                        }
                    }
                }
            }
        }
        //organizar datos en vector ord
        System.out.println();
        for (int i=0;i<esp.length;i++){
            if(esp[i]==1){
                ord[cont]=num[i];
                cont++;
            }
        }
        for (int i=0;i<esp.length;i++){
            if(esp[i]==0){
                ord[cont]=num[i];
                cont++;
            }
        }
        //imprimir salida
        for (int i=0;i<ord.length;i++){
            System.out.println("pos: "+i+"  numero: "+ord[i]);
            }
    }
}