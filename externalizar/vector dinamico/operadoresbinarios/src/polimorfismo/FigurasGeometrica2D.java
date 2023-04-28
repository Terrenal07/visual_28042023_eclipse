package polimorfismo;
public abstract class FigurasGeometrica2D {
    //polimorfismo
    public abstract double area();
    public abstract double perimetro();
    public abstract String Soy();
    //herencia
    public String Dimensiones(){
        return "2";
    }
}
