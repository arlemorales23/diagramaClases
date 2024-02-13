package herencia.ejemplo2;

public class Ticket extends Concert {

    private String concertName;
    private int seatNumber;
    private String ticketType;

    public Ticket(String concertName, String date, String location, double ticketPrice,
                  int seatNumber, String ticketType) {
        super(concertName, date, location, ticketPrice);
        this.concertName = concertName;
        this.seatNumber = seatNumber;
        this.ticketType = ticketType;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public void printInformation() {
        System.out.println("**Ticket information:**");
        System.out.println("Concert name: " + concertName);
        System.out.println("Date: " + getDate());
        System.out.println("Location: " + getLocation());
        System.out.println("Price: $" + getTicketPrice());
        System.out.println("Seat number: " + seatNumber);
        System.out.println("Ticket type: " + ticketType);
    }
}