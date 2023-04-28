package operadoresbinarios;

import java.util.Scanner;

public class calculadoramascarasubred {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //datos
        int sub; //nº de subredes deseadas
        int add=0; //nº de 1s extra
        int mred=1; //nº maximo de subredes
        int[] octb=new int[8];//segundo octeto bin
        int[] octc=new int[8];//tercer octeto bin
        int[] octd=new int[8];//cuarto octeto bin
        int decb=0;
        int decc=0;
        int decd=0; //octetos en decimal
        //entrada
        System.out.println("En una red tipo A, introduzca cantidad de subredes deseadas: ");
        sub=sc.nextInt();
        //proceso
        do{//Rellenar octetos en bianrios de la cantidad de 1s que correspondan
            mred=mred*2;
            add=add+1;
        }while(mred<sub);
        for(int i=0;i<8;i++){
            if(add>0){
                add=add-1;
                octb[i]=1;
            }else{
                octb[i]=0;
            }
        }
        for(int i=0;i<8;i++){
            if(add>0){
                add=add-1;
                octc[i]=1;
            }else{
                octc[i]=0;
            }
        }
        for(int i=0;i<8;i++){
            if(add>0){
                add=add-1;
                octd[i]=1;
            }else{
                octd[i]=0;
            }
        }
        //rellenar octetos decimales
        for (int i = 0; i < 8; i++) {
            decb += octb[i] * Math.pow(2,8-1-i);// potencia de 2 al (8-i)de el numero en posicion [i] 
            }
         for (int i = 0; i < 8; i++) {
            decc += octc[i] * Math.pow(2,8-1-i);// potencia de 2 al (8-i)de el numero en posicion [i] 
            }
          for (int i = 0; i < 8; i++) {
            decd += octd[i] * Math.pow(2,8-1-i);// potencia de 2 al (8-i)de el numero en posicion [i] 
            }
        //salida
        System.out.println("MASCARA DE SUBRED");
        System.out.print(" 255.");
        System.out.print(decb+".");
        System.out.print(decc+".");
        System.out.print(decd);
        System.out.println();
    }
}