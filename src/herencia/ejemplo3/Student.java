package herencia.ejemplo3;

public class Student extends Person {

    private String major;
    private String id;

    public Student(String name, int age, String major, String id) {
        super(name, age);
        this.major = major;
        this.id = id;
    }

    public Student(String name, int age, String major) {
        this(name, age, major, "No ID");
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Major: " + major);
        System.out.println("ID: " + id);
    }
}