package polimorfismo;
public class Triangulo extends FigurasGeometrica2D{

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double base;
    public double altura;

    @Override
    public double area() {
        return this.base*this.altura/2;
    }

    @Override
    public double perimetro() {
        return this.base*3;
    }
        @Override
    public String Soy() {
        return "triangulo";
    }
}
