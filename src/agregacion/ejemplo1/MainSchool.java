package agregacion.ejemplo1;

public class MainSchool {
    public static void main(String[] args) {

        School school = new School("Central High School");

        Student student1 = new Student("Sebastian Perez", "10th", 12345);
        Student student2 = new Student("Juana Alvarez", "11th", 54321);
        Student student3 = new Student("Peter Smith", "11th", 98765);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        System.out.println(school);
    }
}
