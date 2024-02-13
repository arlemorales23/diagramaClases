package depen.ejemplo1;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        System.out.println("The car is running.");
        car.accelerate();
        System.out.println("The car is accelerating.");
        car.brake();
        System.out.println("The car is braking.");
        car.turnOff();
        System.out.println("The car is turned off.");
    }
}
