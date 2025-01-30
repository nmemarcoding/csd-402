// Name: Nima Memarzadeh
// Date: 01/30/2025
// Assignment: Module 5 Programming Assignment


// This program contains methods that locate the largest 
// and smallest elements in a 2D array of integers and doubles.

public class ArrayLocator {
    public static int[] locateLargest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1};
        }
        int[] location = {0, 0};
        double max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1};
        }
        int[] location = {0, 0};
        int max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1};
        }
        int[] location = {0, 0};
        double min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{-1, -1};
        }
        int[] location = {0, 0};
        int min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        
        double[][] doubles = {{1.1, 2.2, 3.3}, {7.9, 4.4, 5.5, 6.6}};
        int[][] ints = {{1,8 , 2, 3}, {4, 5, 6}};
        
        // Test the methods with double array
        int[] largestDoubleLocation = locateLargest(doubles);
        int[] smallestDoubleLocation = locateSmallest(doubles);
        System.out.println("Largest element in double array at: [" + largestDoubleLocation[0] + ", " + largestDoubleLocation[1] + "]");
        System.out.println("Smallest element in double array at: [" + smallestDoubleLocation[0] + ", " + smallestDoubleLocation[1] + "]");
        
        // Test the methods with int array
        int[] largestIntLocation = locateLargest(ints);
        int[] smallestIntLocation = locateSmallest(ints);
        
        System.out.println("Largest element in int array at: [" + largestIntLocation[0] + ", " + largestIntLocation[1] + "]");
        System.out.println("Smallest element in int array at: [" + smallestIntLocation[0] + ", " + smallestIntLocation[1] + "]");

        // Test with null array
        double[][] nullArray = null;
        int[] resultNull = locateLargest(nullArray);
        System.out.println("Result for null array: [" + resultNull[0] + ", " + resultNull[1] + "]");
    }
}