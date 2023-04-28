package polimorfismo;
import static libreriaibf.MetodosUtil.staticRedondear;
public class PrincipalPolimorfismo {
    public static void main(String[] args) {
        //se pueden generar arrays con cualquier dato que englobe la clase padre
        FigurasGeometrica2D[] vector={
            new Triangulo(2.2,3.1)
            ,new Circulo(1.5)
            ,new Triangulo(3.4,2.6)
            ,new Rectangulo(7.7,8.1)
            ,new Cuadrado(8.1)
            ,new Cuadrado(9.2)
        };
        for(int i=0;i<vector.length;i++){
            FigurasGeometrica2D fg=vector[i];
            System.out.println("Area "+fg.Soy()+": "+ staticRedondear(fg.area())+" mm2");
            //(hay que arreglarlo) System.out.printf("Area %s : %d mm2", fg.soy(),staticRedondear(fg.area()));
        }

    }
    
}
