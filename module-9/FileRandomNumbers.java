// Name: Nima Memarzadeh
// Date: 02/13/2025
// Assignment: Module 9 Programming Assignment 2

// This program demonstrates the use of ArrayList and
//  exception handling in Java. It creates an ArrayList
//   of strings, prints the list, and prompts the user to
//    enter an index to retrieve an element. The program 
//    handles exceptions for invalid input and out-of-bounds
//     indices, allowing the user to retry or exit the program.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileRandomNumbers {
    public static void main(String[] args) {
        // Define the file name
        File file = new File("data.file");

        try {
            // Check if the file exists. If not, create a new file.
            if (!file.exists()) {
                System.out.println("File does not exist. Creating new file: data.file");
                file.createNewFile();
            } else {
                System.out.println("File already exists. Appending new numbers.");
            }
            
            // Create a FileWriter in append mode
            FileWriter fw = new FileWriter(file, true);
            Random random = new Random();

            // Generate and write 10 random numbers, each separated by a space
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // Random number between 0 and 99
                fw.write(num + " ");
            }
            // Write a newline for clarity between runs
            fw.write(System.lineSeparator());
            fw.close();
            
            // Read the file and display its contents
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Contents of data.file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

