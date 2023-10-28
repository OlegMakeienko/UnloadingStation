package docks;

import java.util.Map;

public class DockLogic {
    public static String assignDock(Map<String, Integer> availableDocks, int truckType) {
        for (Map.Entry<String, Integer> entry : availableDocks.entrySet()) {
            if (entry.getValue() > 0) {
                if (truckType == 1) {
                    if (entry.getKey().equals("A") || entry.getKey().equals("B")) {
                        return entry.getKey();
                    }
                } else if (truckType == 2) {
                    if (entry.getKey().equals("C") || entry.getKey().equals("D")) {
                        return entry.getKey();
                    } else if (entry.getKey().equals("A")) {
                        return entry.getKey();
                    }
                } else if (truckType == 3) {
                    if (entry.getKey().equals("E")) {
                        return entry.getKey();
                    } else if (entry.getKey().equals("D")) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }
}
