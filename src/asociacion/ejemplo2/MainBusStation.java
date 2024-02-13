package asociacion.ejemplo2;

public class MainBusStation {
    public static void main(String[] args) {

        // We create a bus station
        BusStation station = new BusStation("Central Station");

        // We create some routes
        Route route1 = new Route("Madrid", 20.50);
        Route route2 = new Route("Barcelona", 25.00);
        Route route3 = new Route("Sevilla", 15.75);

        // We add the routes to the station
        station.addRoute(route1);
        station.addRoute(route2);
        station.addRoute(route3);

        // We list the routes available at the station
        System.out.println("Routes available at " + station.getName() + ":");
        station.listRoutes();

    }
}
