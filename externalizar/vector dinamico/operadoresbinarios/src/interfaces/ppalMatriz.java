package interfaces;
public class ppalMatriz {
    public static void main(String[] args) {
        int[][] matriz=new int[2][5];
        //aleatorizar matriz
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(int)(Math.random()*100+1);
                System.out.print("("+matriz[i][j]+"),");
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrizaux = new solucionMatriz().convierteCeroLosParesy1Impares(matriz);
        for (int i=0;i<matrizaux.length;i++){
            for(int j=0;j<matrizaux[i].length;j++){
                System.out.print("("+matrizaux[i][j]+"),");
            }
            System.out.println();
        }
    }
}
