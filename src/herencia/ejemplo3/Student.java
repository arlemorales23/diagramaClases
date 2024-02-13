package herencia.ejemplo3;

public class Student extends Person {

    private String profession;
    private String id;

    public Student(String name, int age, String profession, String id) {
        super(name, age);
        this.profession = profession;
        this.id = id;
    }

    public Student(String name, int age, String profession) {
        this(name, age, profession, "No ID");
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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
        System.out.println("Profession: " + profession);
        System.out.println("ID: " + id);
    }
}