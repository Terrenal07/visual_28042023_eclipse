package ejerciciosMatrices;

public class utiles {
    public static void imprimirMatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("(" + matriz[i][j] + "),");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void limpiarpantalla(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}