package hashmap01;
public class producto {
    
    private String idProducto;
    private String nombre;
    private double precio;
    private String cifProveedor;

    public producto() {
    }

    public producto(String idProducto, String nombre, double precio, String cifProveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cifProveedor = cifProveedor;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getcifProveedor() {
        return cifProveedor;
    }

    public void setcifProveedor(String cifProveedor) {
        this.cifProveedor = cifProveedor;
    }
    
    @Override
    public String toString() {
        return "producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", cif=" + cifProveedor + '}';
    }
}
