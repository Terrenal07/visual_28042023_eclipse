package operadoresbinarios;


import java.util.Scanner;

public class generadoriprandom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //datos
        String mask="255.255.0.0";//input string mascara de subred
        String red="10.0.0.0"; //input string nombre red
        String binario;
        int redfor[]={00001010,00000000,00000000,00000000};
        int maskfor[]={11111111,00000000,00000000,00000000};
        int[][] binred = {
                     {0,0,0,0,1,0,1,0},
                     {0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0}};//por ahora estatico
        int[][] binmask = {
                     {1,1,1,1,1,1,1,1},
                     {0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0}};//por ahora estatico
        int[][] bin=new int[4][8];
        int[]oct=new int[8];//octetos en decimal
        //entrada
        //datos staticos por ahora
        String[] pmask=mask.split("\\.");
        String[] pred=red.split("\\.");
        //proceso
        //convertir vector de 4 en binario a matriz de 4x8 para la mascara
        for (int i = 0; i < 4; i++) {
            binario = Integer.toBinaryString(maskfor[i]);
            int longitud = binario.length();
            for (int j = 0; j < 8; j++) {
                }
            System.out.println(binario);
        }
        //se genera una matriz de 4x8 que se rellena aleatoriamente de 1s y 0s
        for (int i = 0; i < 4; i++) { //se genera una matriz de 4x8 que se rellena aleatoriamente de 1s y 0s
            for (int j = 0; j < 8; j++) {
                bin[i][j]=(int)(Math.random()*2); //genera 0 o 1 aleatoriamente
            }
        }
        //se compara con la matriz de la mascara y se sustituyen solo los valores que no coinciden
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 8; j++) {
                if(binmask[i][j]==1){
                    bin[i][j]=binred[i][j];
                }
            }
        }
                //en decimal
        for(int i=0;i<4;i++){
            for(int j=0;j<8;j++){
                oct[i] += bin[i][j] * Math.pow(2,8-1-j);
            }
        }
        //salida
        System.out.println(" ");
        System.out.println(" ");
        //convertir matrices a salida decimal
        for(int i=0;i<4;i++){
            if(i==3){
                System.out.print(oct[i]);
                    }else{
                System.out.print(oct[i]+".");
                    }
            }
        System.out.println(" ");
        System.out.println(" ");
    }
}
