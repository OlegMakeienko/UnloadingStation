import docks.Dock;
import docks.DockLogic;
import truck.Truck;
import typesAvVehicle.VehicleFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class UnloadingStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Truck> dockedTrucks = new ArrayList<>();
        Map<String, Integer> availableDocks = new HashMap<>();

        availableDocks.put("A", 1);
        availableDocks.put("B", 1);
        availableDocks.put("C", 1);
        availableDocks.put("D", 1);
        availableDocks.put("E", 1);

        while (true) {
            System.out.println("– Dumpa Mera Unloading Station –");
            System.out.println("1. View Parked Trucks");
            System.out.println("2. Register a New Unloading Truck");
            System.out.println("3. Exit");
            System.out.print("Select from the list: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewDockedTrucks(dockedTrucks);
                    break;
                case 2:
                    if (availableDocks.isEmpty()) {
                        System.out.println("Sorry, it's full, redirect the driver to the Dumpa Mest station!");
                    } else {
                        registerTruck(scanner, dockedTrucks, availableDocks);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void viewDockedTrucks(List<Truck> dockedTrucks) {
        System.out.println("Parked Trucks:");

    }

    static void registerTruck(Scanner scanner, List<Truck> dockedTrucks, Map<String, Integer> availableDocks) {
        System.out.println("Type of truck:");
        System.out.println("1. Van");
        System.out.println("2. Light Truck");
        System.out.println("3. Heavy Truck");
        System.out.print("Select from the list: ");
        int truckTypeChoice = scanner.nextInt();

        String dock = DockLogic.assignDock(availableDocks, truckTypeChoice);

        if (dock != null) {
            Truck truck = null;
            switch (truckTypeChoice) {
                case 1:
                    System.out.print("Weight of the Van: ");
                    double weight = scanner.nextDouble();
                    truck = VehicleFactory.createVan(weight);
                    break;
                case 2:
                    System.out.print("Weight of the Light Truck: ");
                    weight = scanner.nextDouble();
                    truck = VehicleFactory.createLightTruck(weight);
                    break;
                case 3:
                    System.out.print("Weight of the Heavy Truck: ");
                    weight = scanner.nextDouble();
                    truck = VehicleFactory.createHeavyTruck(weight);
                    break;
                default:
                    System.out.println("Invalid truck type.");
            }

            if (truck != null) {
                dockedTrucks.add(truck);
                availableDocks.put(dock, availableDocks.get(dock) - 1);
                System.out.println("Truck registered at dock " + dock);
            }
        } else {
            System.out.println("Sorry, it's full, redirect the driver to the Dumpa Mest station!");
        }
    }
}