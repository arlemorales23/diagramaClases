package herencia.ejemplo2;

public class MainConcert {
    public static void main(String[] args) {
        Concert concert = new Concert("Metallica", "2024-03-15", "National Stadium", 50000);
        Ticket generalTicket = new Ticket("Metallica", "2024-03-15", "National Stadium", 50000, 123, "General");
        generalTicket.printInformation();

        Ticket vipTicket = new Ticket("Metallica", "2024-03-15", "National Stadium", 75000, 456, "VIP");
        vipTicket.printInformation();
    }
}
