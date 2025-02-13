// Name: Nima Memarzadeh
// Date: 02/13/2025
// Assignment: Module 9 Programming Assignment 1

// This program demonstrates the use of ArrayList and exception handling in Java.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList and fill it with at least 10 Strings.
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Fig");
        stringList.add("Grape");
        stringList.add("Honeydew");
        stringList.add("Ita Palm");
        stringList.add("Jackfruit");

        // Use a for-each loop to print the ArrayList collection.
        System.out.println("The list contains:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Create a Scanner to work with user input.
        Scanner scanner = new Scanner(System.in);

        while (true) {  // Loop to allow multiple attempts
            System.out.println("\nWhich element (index) would you like to see again? (Enter an integer index)");

            // Read the user's input as a String.
            String userInput = scanner.nextLine();

            try {
                // Autoboxing: parse the string to a primitive int and assign it to an Integer.
                Integer index = Integer.parseInt(userInput);
                // Auto-unboxing occurs here when the Integer is passed to get(), which expects an int.
                String selectedElement = stringList.get(index);
                System.out.println("Element at index " + index + " is: " + selectedElement);
                break; // Exit loop after a valid input
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Exception has been thrown: Out of Bounds. Please enter a number between 0 and " + (stringList.size() - 1));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }

            // Ask if the user wants to try again
            System.out.println("Would you like to try again? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break; // Exit the loop if the user does not want to try again
            }
        }

        // Close scanner to prevent memory leak.
        scanner.close();
    }
}
