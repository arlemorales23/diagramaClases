package depen.ejemplo3;

public class Client {

    private String name;
    private String contactNumber;

    public Client(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
