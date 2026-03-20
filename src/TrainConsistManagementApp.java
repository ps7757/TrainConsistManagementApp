/**
 * Train Consist Management App
 * UC5: Preserve Insertion Order using LinkedHashSet
 *
 * Demonstrates uniqueness + insertion order preservation
 * using LinkedHashSet for train formation.
 *
 * @author YourName
 * @version 5.0
 */

import java.util.LinkedHashSet;

public class TrainConsistUC5 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC5: LinkedHashSet Formation ===");
        System.out.println("======================================");

        // Create LinkedHashSet for bogies
        LinkedHashSet<String> formation = new LinkedHashSet<>();

        // Attach bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempt to add a duplicate bogie
        formation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(formation);

        System.out.println("\nNote: Duplicate bogies are automatically ignored.");

        System.out.println("\nProgram continues...");
    }
}