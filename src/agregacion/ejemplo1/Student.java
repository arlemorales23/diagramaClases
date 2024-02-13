package agregacion.ejemplo1;

public class Student {

    private String name;
    private String grade;
    private int id;

    public Student(String name, String grade, int id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", id=" + id +
                '}';
    }
}
