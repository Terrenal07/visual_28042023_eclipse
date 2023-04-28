package matrices;

import java.util.Scanner;

public class matrizdinamica {
    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
        //datos
        int fil,col,sum;
        sum=0;
        //entrada
        System.out.println("filas: ");
        fil=sc.nextInt();
        System.out.println("columnas: ");
        col=sc.nextInt();
        //proceso
        int[][] matriz = new int[fil][col];
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                matriz[i][j]=(int)(Math.random()*6+1);
            }
        }
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                if(i>j){
                    sum=sum+matriz[i][j];
                }
                }
            }
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                if(i<=j){
                    matriz[i][j]=0;
                }
                }
            }
        //salida
        for(int i=0;i<fil;i++){
            for(int j=0;j<col;j++){
                if(j<col-1){
                     System.out.print(matriz[i][j]+" - ");
                }else{
                    System.out.println(matriz[i][j]);
                }
            }
        }
        System.out.println("suma inferior a la diagonal: "+sum);
        //intercambio filas por columnas
        for(int j=0;j<col;j++){
            for(int i=0;i<fil;i++){
                if(i<fil-1){
                    System.out.print(matriz[i][j]+"-");
                }else{
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}

    
    

