package ejercicioclibreria;
import java.util.Scanner;
import libreriaibf.MetodosUtil;
import static libreriaibf.MetodosUtil.staticRedondear;

public class PrincipalVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int v[];
        System.out.println("Ingrese tamaño vector: ");
        n = sc.nextInt();
        v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 6 + 1);
        }
        System.out.println("promedio: "+staticRedondear(MetodosUtil.promedioVector(v)));
    }
}