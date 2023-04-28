package ejerciciosMatrices;

import java.util.Scanner;

public class ejercicios implements IOperacionesMatrices{
    @Override
    public int[][] ejercicio1() {
        int[][]matriz=new int[3][6];
        matriz[0][0]=0;
        matriz[0][1]=30;
        matriz[0][2]=2;
        matriz[0][5]=5;
        matriz[1][0]=75;
        matriz[1][4]=0;
        matriz[2][2]=-2;
        matriz[2][3]=9;
        matriz[2][5]=11;
        return matriz;
        }

    @Override
    public int[][] ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz=new int[4][5];
        for(int i=0;i<matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce valor numerico en casilla "+i+","+j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }
}
