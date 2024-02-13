package herencia.ejemplo2;

public  class Concert {

    private String name;
    private String date;
    private String location;
    private double ticketPrice;

    public Concert(String name, String date, String location, double ticketPrice) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.ticketPrice = ticketPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
