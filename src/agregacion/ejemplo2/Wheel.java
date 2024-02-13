package agregacion.ejemplo2;

public class Wheel {

    private int size;
    private String material;

    public Wheel(int size, String material) {
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", material='" + material + '\'' +
                '}';
    }
}

