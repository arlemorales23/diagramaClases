package agregacion;

public class Main {
    public static void main(String[] args) {
        Producto pro = new Producto("gafas", 30);
        pro.nombreProducto = "Zapatos";
        System.out.println(pro.getNombreProducto().length());
    }
}
