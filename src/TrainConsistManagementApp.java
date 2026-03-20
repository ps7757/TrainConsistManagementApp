/**
 * Train Consist Management App
 * UC2: Add Passenger Bogies using ArrayList Operations
 *
 * Demonstrates add, remove, and contains operations
 * on a dynamic list of passenger bogies.
 *
 * @author YourName
 * @version 2.0
 */

import java.util.ArrayList;

public class TrainConsistUC2 {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC2: Passenger Bogie Management ===");
        System.out.println("======================================");

        // Initialize ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Display bogies after removal
        System.out.println("\nPassenger Bogies after removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Check existence of a bogie
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes 'Sleeper' bogie exist? " + exists);

        // Final state
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}