package polimorfismo.herencia;

public class Rectangulo extends FigurasGeometrica2D{
    public double base;
    public double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    @Override
    public double area() {
        return this.base*altura;
    }

    @Override
    public double perimetro() {
        return 2*this.altura+2*this.base;
    }
        @Override
    public String Soy() {
        return "rectangulo";
    }
}
