package depen.ejemplo3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgency {

    private List<Property> properties; // Dependency on the Property class
    private List<Client> clients; // Dependency on the Client class

    public RealEstateAgency() {
        this.properties = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Property> findPropertiesForSale() {
        List<Property> propertiesForSale = new ArrayList<>();
        for (Property property : properties) {
            if (property.isForSale()) {
                propertiesForSale.add(property);
            }
        }
        return propertiesForSale;
    }

    public void sellProperty(Property property, Client client) {
        if (property.isForSale()) {
            property.setForSale(false);
            property.setOwner(client);
        }
    }
}