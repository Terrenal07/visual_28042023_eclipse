package libreriaibf;

public class MetodosUtil {
    public double redondear (double numeroDecimal){
        return Math.round(numeroDecimal*100.0)/100.0;
    }
    public static double staticRedondear (double numeroDecimal){
        return Math.round(numeroDecimal*100.0)/100.0;
    }
    public void voidRedondear(double numeroDecimal) {
    double resultado = Math.round(numeroDecimal * 100.0) / 100.0;
    System.out.println(resultado);
    }
        public static double promedioVector(int[] v) {
        double suma = 0.0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma / (double) v.length;
    }
}