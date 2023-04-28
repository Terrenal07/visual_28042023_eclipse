package matrices;
public class matrizestatica {
    public static void main(String[] args) {
        //datos
        int i,j;
        int[][]numeros={{2,3,4,5},{7,8,9,1},{4,2,3,8}};
        //matriz de (3 filas x 4columnas)
        //salida
        for(i=0;i<numeros.length;i++){//se encarga de filas
            for(j=0;j<numeros[0].length;j++){//se encarfa de columnas
            System.out.print("-"+numeros[i][j]+"-");
        }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        //centrado
        int[][] piramide={{1,1,1},{1,1,1},{1},{1,1,1,1,1,1,1,1,1},{1,1,1,1,1},{1}};
int numRows = piramide.length;
int maxRowLength = piramide[numRows-1].length;
for (i=0;i<numRows;i++){
    if (piramide[i].length>maxRowLength){
      maxRowLength=piramide[i].length;  
    }
}
for (i = 0; i < numRows; i++) {
    int padding = (maxRowLength - piramide[i].length) / 2;
    for (int k = 0; k < padding; k++) {
        System.out.print(" ");
    }
    for (j = 0; j < piramide[i].length; j++) {
        System.out.print(piramide[i][j]);
    }
    System.out.println();
}
    }
    
}
