package agregacion.ejemplo2;

public class MainCar {
    public static void main(String[] args) {

        Wheel wheel1 = new Wheel(18, "steel");
        Wheel wheel2 = new Wheel(18, "steel");
        Wheel wheel3 = new Wheel(18, "steel");
        Wheel wheel4 = new Wheel(18, "steel");

        Car car = new Car("Toyota", "Camry");

        car.addWheel(wheel1);
        car.addWheel(wheel2);
        car.addWheel(wheel3);
        car.addWheel(wheel4);

        System.out.println(car);
    }
}
