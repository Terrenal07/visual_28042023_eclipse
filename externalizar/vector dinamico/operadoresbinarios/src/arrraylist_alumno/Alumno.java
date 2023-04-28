package arrraylist_alumno;
class Alumno {
    private int id;
    private String nombre;
    private double estatura;
    private boolean casado;

    public Alumno() {
    }

    public Alumno(int id, String nombre, double estatura, boolean casado) {
        this.id = id;
        this.nombre = nombre;
        this.estatura = estatura;
        this.casado = casado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    //otros metodos

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", estatura=" + estatura + ", casado=" + casado + '}';
    }
    
}
