package triangulo;
public class Triangulo {
    //atributos (caracteristicas que definen al objeto)
        //los atributos calculables no se ponen como atributos (ejmplo: area)
    private double base;
    private double altura;
    //constructores
        //inicializan atributos del objeto (dan valores a estos)
    public Triangulo() {
    }
    public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
    }
    //metodos GET y SET
        //asignar valores y recuperar valores del objeto
        public double getBase() {
        return base;
    }
        public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //otros
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    public double area(){
        return this.base*this.altura/2;
    }
    public static void cabecera() {
    System.out.printf("%-4s %-7s %-7s %-6s\n", "N", "Base", "Altura", "Area");
    System.out.printf("%-4s %-7s %-7s %-6s\n", "-", "-----", "------", "----");
    }
    public void imprimirDetalles(int numero) {
    System.out.printf("%-4d %-7.2f %-7.2f %-6.2f\n", numero, this.base, this.altura, this.area());
    }
}
