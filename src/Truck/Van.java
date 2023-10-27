package Truck;

import Truck.Truck;
import typesAvVehicle.TypeAvVehicle;

public class Van extends Truck {

    public Van(int weight, String type) {
        super(weight, TypeAvVehicle.VAN);
    }
}
