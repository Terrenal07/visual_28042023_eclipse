package polimorfismo;
public class Circulo extends FigurasGeometrica2D{
    public double radio;

    public double getRadio() {
        return radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio,2);
    }

    @Override
    public double perimetro() {
        return (2*this.radio)*Math.PI;
    }
        @Override
    public String Soy() {
        return "circulo";
    }
}
