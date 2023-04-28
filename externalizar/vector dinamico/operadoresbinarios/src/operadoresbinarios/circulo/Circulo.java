package operadoresbinarios.circulo;
public class Circulo {   
    //atributos
    private double radio;
    //constructores
    public Circulo() {
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    //metodo get
    public double getRadio() {
        return radio;
    }
    //metodo set
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //otros
    public double area(){
    return (Math.PI)*(Math.pow(this.radio, 2));
    }
    public static void cabecera() {
    System.out.printf("%-4s %-7s %-6s\n", "N", "Radio", "Area");
    System.out.printf("%-4s %-7s %-6s\n", "-", "-----", "------");
    }
    public void imprimirDetalles(int numero) {
    System.out.printf("%-4d %-7.2f %-6.2f\n", numero, this.radio, this.area());
    }
}
