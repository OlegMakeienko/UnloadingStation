package docks;

import java.util.ArrayList;
import java.util.List;

public class DockBuilder {
    private String label;
    private double maxWeight;
    private List<String> allowedTruck;

    public DockBuilder() {
        this.maxWeight = -1;
        this.allowedTruck = new ArrayList<>();
    }

    public DockBuilder label(String label) {
        this.label = label;
        return this;
    }

    public DockBuilder maxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
        return this;
    }

    public DockBuilder truckType(String truckType) {
        allowedTruck.add(truckType);
        return this;
    }

    public Dock build() {
        return new Dock(label, maxWeight, allowedTruck);
    }
}
