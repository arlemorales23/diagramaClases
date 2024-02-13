package asociacion.ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class BusStation {

    private String name;
    private List<Route> routes;

    public BusStation(String name) {
        this.name = name;
        this.routes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public void addRoute(Route route) {
        routes.add(route);
    }

    public void listRoutes() {
        for (Route route : routes) {
            System.out.println("- " + route.getDestination() + " - Price: " + route.getPrice() + "€");
        }
    }

}
