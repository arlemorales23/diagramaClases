package agregacion.ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String make;
    private String model;
    private List<Wheel> wheels;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.wheels = new ArrayList<>();
    }

    public void addWheel(Wheel wheel) {

        wheels.add(wheel);
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car: ").append(make).append(" ").append(model).append("\n");
        for (Wheel wheel : wheels) {
            sb.append(wheel).append("\n");
        }
        return sb.toString();
    }
}
