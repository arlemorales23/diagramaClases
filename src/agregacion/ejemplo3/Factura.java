package agregacion;

public class Factura {
    private String numeroFactura;
    private String fecha;
    Producto producto;

    public Factura(String numeroFactura, String fecha, Producto producto) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.producto = producto;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroFactura='" + numeroFactura + '\'' +
                ", fecha='" + fecha + '\'' +
                ", producto= " + producto +
                '}';
    }
}
