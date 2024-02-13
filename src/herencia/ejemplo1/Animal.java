package herencia.ejemplo1;

// Parent class Animal
public class Animal {

    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void eat() {
        System.out.println("The animal " + name + " is eating.");
    }

    public void sleep() {
        System.out.println("The animal " + name + " is sleeping.");
    }
}
