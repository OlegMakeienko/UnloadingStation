package truck;

public abstract class Truck {
    private double weight;
    private String type;

    public Truck(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}
