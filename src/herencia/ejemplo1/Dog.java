package herencia.ejemplo1;

// Child class Dog
public class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed) {
        super(name, "Dog");
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The dog " + name + " is barking.");
    }
}
