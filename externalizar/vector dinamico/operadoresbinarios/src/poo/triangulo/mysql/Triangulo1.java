package poo.triangulo.mysql;

public class Triangulo1 {
    //atributos (caracteristicas que definen al objeto)
        //los atributos calculables no se ponen como atributos (ejmplo: area)
    private int id;
    private double base;
    private double altura;
    //constructores
        //inicializan atributos del objeto (dan valores a estos)
    public Triangulo1() {
    }
    public Triangulo1(int id, double base, double altura) {
    this.id =id;
    this.base = base;
    this.altura = altura;
   
    }
    //metodos GET y SET
        //asignar valores y recuperar valores del objeto
        public double getBase() {
        return base;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
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
    protected void finalize() throws Throwable {
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public double area(){
        return this.base*this.altura/2;
    }
    public static void cabecera() {
    System.out.printf("%-4s %-7s %-7s %-6s\n", "Id", "Base", "Altura", "Area");
    System.out.printf("%-4s %-7s %-7s %-6s\n", "-", "-----", "------", "----");
    }
    public void imprimirDetalles(int numero) {
    System.out.printf("%-4d %-7.2f %-7.2f %-6.2f\n", numero, this.base, this.altura, this.area());
    }
}
