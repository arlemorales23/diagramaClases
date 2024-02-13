package herencia.ejemplo3;

public class MainStudent {
    public static void main(String[] args) {
        Person persona = new Person("Ana", 25);
        persona.showInformation();

        Student estudiante1 = new Student("Juan", 20, "Computer Engineering", "123456");
        estudiante1.showInformation();

        Student estudiante2 = new Student("María", 22, "Law");
        estudiante2.showInformation();
    }
}
