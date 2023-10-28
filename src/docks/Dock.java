package docks;

import truck.Truck;

import java.util.List;

public class Dock {
    private String label;
    private double maxWeight;
    private List<String> allowedTruck;
    private Truck truck;

    public Dock(String label, double maxWeight, List<String> allowedTruck) {
        this.label = label;
        this.maxWeight = maxWeight;
        this.allowedTruck = allowedTruck;
    }

    public boolean isEmpty() {
        return truck == null;
    }

    public boolean parkTruck(Truck truck) {
        if(!allowedTruck.contains(truck.getType())) {
            return false;
        } else if(this.maxWeight > 0 && truck.getWeight() > this.maxWeight) {
            return false;
        } else {
            this.setTruck(truck);
        }
        return true;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return label + " dock is empty";
        }

        return label + " dock contains " + truck.getType() + " of weight " + truck.getWeight();
    }
}
