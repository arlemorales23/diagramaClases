package asociacion.ejemplo2;

public class Route {

    private String destination;
    private Double price;

    public Route(String destination, Double price) {
        this.destination = destination;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public Double getPrice() {
        return price;
    }

}
