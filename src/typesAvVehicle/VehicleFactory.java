package typesAvVehicle;

import truck.HeavyTruck;
import truck.LightTruck;
import truck.Truck;
import truck.Van;

public class VehicleFactory {
    public static Truck create(String typeAvVehicle, double weight) {
        switch (typeAvVehicle) {
            case TypeAvVehicle.VAN: return new Van(weight);
            case TypeAvVehicle.LIGHT_TRUCK: return new LightTruck(weight);
            case TypeAvVehicle.HEAVY_TRUCK: return new  HeavyTruck(weight);
            default: throw  new IllegalArgumentException("Truck type does not exist: " + typeAvVehicle);
        }
    }

    public static Truck createVan(double weight) {
        return create(TypeAvVehicle.VAN, weight);
    }
    public static Truck createLightTruck(double weight) {
        return create(TypeAvVehicle.LIGHT_TRUCK, weight);
    }
    public static Truck createHeavyTruck(double weight) {
        return create(TypeAvVehicle.HEAVY_TRUCK, weight);
    }

}
