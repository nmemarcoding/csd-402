// Name: Nima Memarzadeh
// Date: 01/07/2025
// Assignment: Module 1 Programming Assignment


// This program calculates the energy needed to heat
//  water from an initial temperature to a final temperature.


import java.util.Scanner;

class HeatEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mass, initialTemperature, finalTemperature, heatEnergy;

        // Mass validation
        while (true) {
            System.out.println("Enter the mass of the water in kilograms: ");
            if (input.hasNextDouble()) {
                mass = input.nextDouble();
                if (mass > 0) break;
                System.out.println("Mass must be greater than 0!");
            } else {
                System.out.println("Please enter a valid number!");
                input.next();
            }
        }

        // Initial temperature validation
        while (true) {
            System.out.println("Enter the initial temperature of the water in Celsius: ");
            if (input.hasNextDouble()) {
                initialTemperature = input.nextDouble();
                break;
            } else {
                System.out.println("Please enter a valid temperature!");
                input.next();
            }
        }

        // Final temperature validation
        while (true) {
            System.out.println("Enter the final temperature of the water in Celsius: ");
            if (input.hasNextDouble()) {
                finalTemperature = input.nextDouble();
                break;
            } else {
                System.out.println("Please enter a valid temperature!");
                input.next();
            }
        }

        heatEnergy = mass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed to heat the water from " + initialTemperature + " to " + finalTemperature + " is " + heatEnergy + " joules.");

        input.close();
    }
}