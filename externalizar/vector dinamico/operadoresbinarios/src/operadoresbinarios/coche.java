package operadoresbinarios;
public class coche {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private String color;

    // Constructor
    public coche(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    // Métodos
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando...");
    }

    public void frenar() {
        System.out.println("El coche " + marca + " " + modelo + " está frenando...");
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El coche " + marca + " " + modelo + " ahora es de color " + color);
    }
}
