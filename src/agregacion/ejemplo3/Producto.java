package agregacion;

public class Producto {

    public String nombreProducto;
    private int valor;

    public Producto(String nombreProducto, int valor) {
        this.nombreProducto = nombreProducto;
        this.valor = valor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return
                "nombreProducto='" + nombreProducto + '\'' +
                ", valor=" + valor ;
    }
}
