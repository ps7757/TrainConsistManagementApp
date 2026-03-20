/**
 * Train Consist Management App
 * UC3: Track Unique Bogie IDs using HashSet
 *
 * Demonstrates how Set ensures uniqueness and prevents duplicates.
 *
 * @author YourName
 * @version 3.0
 */

import java.util.HashSet;

public class TrainConsistUC3 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC3: Unique Bogie IDs (HashSet) ===");
        System.out.println("======================================");

        // Create HashSet for bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final set
        System.out.println("\nUnique Bogie IDs in the train:");
        System.out.println(bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically ignored by HashSet.");

        System.out.println("\nProgram continues...");
    }
}