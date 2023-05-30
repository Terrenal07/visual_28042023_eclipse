package archivo_csv;

public class transacciones {
    private int IDTRANSACCION;
    private String CIUDAD;
    private String ZONA;
    private double VENTAS;
    private String FORMA_PAGO;
    private String CATEGORIA;

    public transacciones() {
    }

    public transacciones(int IDTRANSACCION, String CIUDAD, String ZONA, double VENTAS, String FORMA_PAGO, String CATEGORIA) {
        this.IDTRANSACCION = IDTRANSACCION;
        this.CIUDAD = CIUDAD;
        this.ZONA = ZONA;
        this.VENTAS = VENTAS;
        this.FORMA_PAGO = FORMA_PAGO;
        this.CATEGORIA = CATEGORIA;
    }

    public int getIDTRANSACCION() {
        return IDTRANSACCION;
    }

    public void setIDTRANSACCION(int IDTRANSACCION) {
        this.IDTRANSACCION = IDTRANSACCION;
    }

    public String getCIUDAD() {
        return CIUDAD;
    }

    public void setCIUDAD(String CIUDAD) {
        this.CIUDAD = CIUDAD;
    }

    public String getZONA() {
        return ZONA;
    }

    public void setZONA(String ZONA) {
        this.ZONA = ZONA;
    }

    public double getVENTAS() {
        return VENTAS;
    }

    public void setVENTAS(double VENTAS) {
        this.VENTAS = VENTAS;
    }

    public String getFORMA_PAGO() {
        return FORMA_PAGO;
    }

    public void setFORMA_PAGO(String FORMA_PAGO) {
        this.FORMA_PAGO = FORMA_PAGO;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    @Override
    public String toString() {
        return "transacciones{" + "IDTRANSACCION=" + IDTRANSACCION + ", CIUDAD=" + CIUDAD + ", ZONA=" + ZONA + ", VENTAS=" + VENTAS + ", FORMA_PAGO=" + FORMA_PAGO + ", CATEGORIA=" + CATEGORIA + '}';
    }

    

    
}
