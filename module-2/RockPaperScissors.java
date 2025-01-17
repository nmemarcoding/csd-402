// Name: Nima Memarzadeh
// Date: 01/17/2025
// Assignment: Module 2 Programming Assignment

// Rock Paper Scissors game in Java


import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 3 for the computer's choice
        int computerChoice = (int) (Math.random() * 3) + 1;

        int userChoice = 0;

        // Input validation loop
        while (true) {
            System.out.println("Welcome to Rock-Paper-Scissors!");
            System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();

                // Check if the number is within the valid range
                if (userChoice >= 1 && userChoice <= 3) {
                    break; // Exit the loop if input is valid
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }

        // Display the choices
        System.out.println("You chose: " + getChoiceName(userChoice));
        System.out.println("Computer chose: " + getChoiceName(computerChoice));

        // Determine and display the result
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to get the name of the choice
    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}
