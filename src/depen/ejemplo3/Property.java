package depen.ejemplo3;

public class Property {

    private String address;
    private int price;
    private boolean forSale;
    private Client owner;

    public Property(String address, int price) {
        this.address = address;
        this.price = price;
        this.forSale = true;
        this.owner = null;
    }

    public String getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
