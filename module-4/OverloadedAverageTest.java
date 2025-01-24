// Name: Nima Memarzadeh
// Date: 01/24/2025
// Assignment: Module 4 Programming Assignment


// This program demonstrates method overloading by
//  defining four overloaded methods to calculate the average of
//   arrays of different types: short, int, long, and double. The
//    program also includes edge cases to test the methods with
//    arrays containing negative numbers, single elements, and zeros.

import java.util.Arrays;

public class OverloadedAverageTest {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Short array must not be empty.");
        }

        long sum = 0; // Use long to safely handle the sum before casting
        for (short value : array) {
            sum += value;
        }
        // Compute average, cast back to short
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Int array must not be empty.");
        }

        long sum = 0; // Use long to handle potential overflow from many int elements
        for (int value : array) {
            sum += value;
        }
        // Compute average, cast to int
        return (int) (sum / array.length);
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Long array must not be empty.");
        }

        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        // Compute average, which remains a long
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Double array must not be empty.");
        }

        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        // Compute average, which is a double
        return sum / array.length;
    }

    public static void main(String[] args) {
        try{
            // Define arrays of different sizes and types
            short[] shortArray = {5, 10, 15, 20};                 // Size 4
            int[] intArray = {1, 2, 3, 4, 5};                     // Size 5
            long[] longArray = {100L, 200L, 300L};                // Size 3
            double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5}; // Size 6

            // Edge Case 1: Array with negative numbers
            int[] negativeIntArray = {-10, -20, -30, -40};

            // Edge Case 2: Single-element arrays
            short[] singleShortArray = {42};
            int[] singleIntArray = {1000};
            long[] singleLongArray = {999999999L};
            double[] singleDoubleArray = {3.14};

            // Edge Case 3: Array with zeros
            short[] zeroShortArray = {0, 0, 0, 0};
            int[] zeroIntArray = {0, 0, 0, 0, 0};
            long[] zeroLongArray = {0L, 0L};
            double[] zeroDoubleArray = {0.0, 0.0, 0.0};

            // Test with short array
            System.out.print("Short array elements: " + Arrays.toString(shortArray));
            System.out.println("-> Average (short) is: " + average(shortArray));
            System.out.println();

            // Test with int array
            System.out.print("Int array elements: " + Arrays.toString(intArray));
            System.out.println("-> Average (int) is: " + average(intArray));
            System.out.println();

            // Test with long array
            System.out.print("Long array elements: " + Arrays.toString(longArray));
            System.out.println("-> Average (long) is: " + average(longArray));
            System.out.println();

            // Test with double array
            System.out.print("Double array elements: " + Arrays.toString(doubleArray));
            System.out.println("-> Average (double) is: " + average(doubleArray));
            System.out.println();

            // Test with negative int array
            System.out.print("Negative int array elements: " + Arrays.toString(negativeIntArray));
            System.out.println("-> Average (int) is: " + average(negativeIntArray));
            System.out.println();

            // Test with single-element arrays
            System.out.print("Single-element short array: " + Arrays.toString(singleShortArray));
            System.out.println("-> Average (short) is: " + average(singleShortArray));
            System.out.println();

            System.out.print("Single-element int array: " + Arrays.toString(singleIntArray));
            System.out.println("-> Average (int) is: " + average(singleIntArray));
            System.out.println();

            System.out.print("Single-element long array: " + Arrays.toString(singleLongArray));
            System.out.println("-> Average (long) is: " + average(singleLongArray));
            System.out.println();

            System.out.print("Single-element double array: " + Arrays.toString(singleDoubleArray));
            System.out.println("-> Average (double) is: " + average(singleDoubleArray));
            System.out.println();

            // Test with zero arrays
            System.out.print("Zero short array elements: " + Arrays.toString(zeroShortArray));
            System.out.println("-> Average (short) is: " + average(zeroShortArray));
            System.out.println();

            System.out.print("Zero int array elements: " + Arrays.toString(zeroIntArray));
            System.out.println("-> Average (int) is: " + average(zeroIntArray));
            System.out.println();

            System.out.print("Zero long array elements: " + Arrays.toString(zeroLongArray));
            System.out.println("-> Average (long) is: " + average(zeroLongArray));
            System.out.println();

            System.out.print("Zero double array elements: " + Arrays.toString(zeroDoubleArray));
            System.out.println("-> Average (double) is: " + average(zeroDoubleArray));
            System.out.println();

            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
