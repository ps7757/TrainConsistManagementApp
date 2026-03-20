/**
 * Train Consist Management App
 * UC4: Maintain Ordered Bogie IDs using LinkedList
 *
 * Demonstrates insertion, deletion, and order preservation
 * using a LinkedList to model a real train consist.
 *
 * @author YourName
 * @version 4.0
 */

import java.util.LinkedList;

public class TrainConsistUC4 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC4: Ordered Bogie Consist ===");
        System.out.println("======================================");

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(consist);

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(consist);

        System.out.println("\nFinal ordered train consist displayed successfully.");

        System.out.println("\nProgram continues...");
    }
}