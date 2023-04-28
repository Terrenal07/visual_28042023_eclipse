

public class MetodosUtil1 {
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
}