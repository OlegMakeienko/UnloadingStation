package Truck;

public class HeavyTruck implements Truck {
    private String type;
    private String dock;
    private double weight;

    public HeavyTruck(String type, String dock, double weight) {
        this.type = type;
        this.dock = dock;
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return type + " at dock " + dock + " with weight " + weight + " tons";
    }
}
