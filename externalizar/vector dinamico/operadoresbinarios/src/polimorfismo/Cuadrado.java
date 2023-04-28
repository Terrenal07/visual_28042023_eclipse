package polimorfismo;
public class Cuadrado extends FigurasGeometrica2D {
    public double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    @Override
    public double area() {
        return Math.pow(this.lado,2);
    }

    @Override
    public double perimetro() {
        return 4*this.lado;
    }
    @Override
    public String Soy() {
        return "cuadrado";
    }
}
