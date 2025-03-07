// Name: Nima Memarzadeh
// Date: 03/07/2025
// Assignment: Module 12 Programming Assignment 

/**
 * A test program that demonstrates the functionality of the AutoService class by executing
 * various scenarios to validate the overloaded yearlyService methods with different parameters.
 */


public class ServiceTest {
    public static void main(String[] args) {
        System.out.println("RUNNING FIRST TEST SCENARIO");
        System.out.println("===========================");
        testScenario1();
        
        System.out.println("\n\nRUNNING SECOND TEST SCENARIO");
        System.out.println("============================");
        testScenario2();
    }
    
    // First test scenario - Testing all methods with positive cases
    private static void testScenario1() {
        System.out.println("Testing all service types with standard/positive cases:");
        
        // Basic service
        System.out.println("\n1. Basic Service:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService()));
        
        // Service with oil change
        System.out.println("\n2. With Oil Change:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService(true)));
        
        // Service with oil change and tire rotation
        System.out.println("\n3. With Oil Change and Tire Rotation:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService(true, true)));
        
        // Complete service with coupon
        System.out.println("\n4. Complete Service with $15 Coupon:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService(true, true, 15.00)));
    }
    
    // Second test scenario - Testing all methods with edge cases
    private static void testScenario2() {
        System.out.println("Testing all service types with alternate/edge cases:");
        
        // Basic service
        System.out.println("\n1. Basic Service:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService()));
        
        // Service without oil change
        System.out.println("\n2. Without Oil Change:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService(false)));
        
        // Service without oil change but with tire rotation
        System.out.println("\n3. No Oil Change but with Tire Rotation:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService(false, true)));
        
        // Basic service with only coupon
        System.out.println("\n4. Basic Service with $5 Coupon:");
        System.out.println("Result: $" + String.format("%.2f", AutoService.yearlyService(false, false, 5.00)));
    }
}