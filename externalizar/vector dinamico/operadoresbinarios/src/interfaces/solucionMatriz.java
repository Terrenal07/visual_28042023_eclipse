package interfaces;
public class solucionMatriz implements OperacionMatriz{

    @Override
    public int[][] convierteCeroLosParesy1Impares(int[][] matriz) {
        int n[][]=matriz;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(n[i][j]%2==0){
                    n[i][j]=0;
                }else{
                    n[i][j]=1;
                }
            }
        }
        return matriz;
    }
    
}
