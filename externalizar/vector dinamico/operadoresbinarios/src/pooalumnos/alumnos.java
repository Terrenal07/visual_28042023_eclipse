package pooalumnos;
public class alumnos {
//atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double nota_media;
//constructores
    public alumnos() {
    }
    public alumnos(int id, String nombre, String apellido, int edad, double nota_media) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota_media = nota_media;
    }
// getter y setter

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }
//otros
     public static void cabecera() {
    System.out.printf("%-4s %-10s %-12s %-7s %-6s\n", "Id", "nombre", "apellido", "edad","nota");
    System.out.println("+----+----------+------------+-------+------+");
    
    }
    public void imprimirDetalles(int numero) {
   System.out.printf("|%3d | %-8s | %-10s | %-5d | %-2.2f | \n", this.id, this.nombre, this.apellido, this.edad, this.nota_media);
    }
    public static void fin() {
    System.out.println("+----+----------+------------+-------+------+");
    }
}
