package depen.ejemplo1;

public class Car {

    private Engine engine; // Dependency on the Engine class

    public Car() {
        this.engine = new Engine(); // Creating an Engine object
    }

    public void start() {
        engine.start(); // Invokes the "start()" method of the Engine class
    }

    public void accelerate() {
        engine.accelerate(); // Invokes the "accelerate()" method of the Engine class
    }

    public void brake() {
        engine.brake(); // Invokes the "brake()" method of the Engine class
    }

    public void turnOff() {
        engine.turnOff(); // Invokes the "turnOff()" method of the Engine class
    }
}
