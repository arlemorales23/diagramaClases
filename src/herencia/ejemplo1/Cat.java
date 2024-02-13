package herencia.ejemplo1;

// Child class Cat
public class Cat extends Animal {

    private String furColor;

    public Cat(String name, String furColor) {
        super(name, "Cat");
        this.furColor = furColor;
    }

    public void meow() {
        System.out.println("The cat " + name + " is meowing.");
    }
}