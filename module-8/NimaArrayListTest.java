// Name: Nima Memarzadeh
// Date: 02/13/2025
// Assignment: Module 8 Programming Assignment

// This program reads integers from the user and
//  stores them in an ArrayList. It then finds the maximum 
//  value in the ArrayList and prints it to the console.

import java.util.ArrayList;
import java.util.Scanner;

class NimaArrayListTest {
    // Method to find the maximum value in an ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        
        Integer maxValue = list.get(0);
        
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        
        return maxValue;
    }
    
    // Method to get user input and populate the ArrayList
    public static ArrayList<Integer> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter integers (enter 0 to finish):");
        
        while (true) {
            try {
                // Check if there's an integer input available
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    numbers.add(input);
                    
                    // Stop input when 0 is entered
                    if (input == 0) {
                        break;
                    }
                } else {
                    // Clear invalid input
                    String invalidInput = scanner.next();
                    System.out.println("Invalid input: '" + invalidInput + "'. Please enter a valid integer.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine(); // Clear the scanner buffer
            }
        }

        scanner.close();
        return numbers;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        try {
            ArrayList<Integer> inputList = getUserInput();
            Integer maximumValue = max(inputList);
            System.out.println("Maximum value: " + maximumValue);
        } catch (Exception e) {
            System.out.println("An error occurred in main: " + e.getMessage());
        }
    }
}
