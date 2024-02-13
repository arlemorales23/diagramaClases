package herencia.ejemplo1;

public class MainAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog("Toby", "Labrador");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Michi", "Gray");
        cat.eat();
        cat.meow();
    }
}
