/**
 * Train Consist Management App
 * UC6: Map Bogie to Capacity using HashMap
 *
 * Demonstrates key-value mapping between bogies and their capacities.
 *
 * @author YourName
 * @version 6.0
 */

import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC6 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC6: Bogie Capacity Mapping ===");
        System.out.println("======================================");

        // Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display bogie-capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}