/**
 * Train Consist Management App
 * UC1: Initialize Train and Display Consist Summary
 *
 * Demonstrates application startup, use of ArrayList,
 * and displaying initial consist state.
 *
 * @author YourName
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================");

        // Initialize train consist using ArrayList
        List<String> bogies = new ArrayList<>();

        // Display initial state
        System.out.println("\nTrain initialized successfully.");
        System.out.println("Initial bogie count: " + bogies.size());

        System.out.println("\nProgram continues...");
    }
}