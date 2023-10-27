package Truck;

public abstract class Truck {
    private int weight;
    private String type;

    public Truck(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}
