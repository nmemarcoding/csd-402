// Name: Nima Memarzadeh
// Date: 02/21/2025
// Assignment: Module 10 Programming Assignment 

// This program implements a company division management 
// system using an abstract Division class with two 
// concrete subclasses (InternationalDivision and DomesticDivision)
// to handle different types of business divisions, demonstrating
// inheritance, abstraction, and polymorphism through division-specific
//  attributes and behaviors.

public class UseDivision {
    public static void main(String[] args) {
        // Create two instances of InternationalDivision
        InternationalDivision intDiv1 = new InternationalDivision("Asia-Pacific Division", 3001, "Singapore", "English & Mandarin");
        InternationalDivision intDiv2 = new InternationalDivision("European Operations", 3002, "Netherlands", "Dutch & English");

        // Create two instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("West Coast Division", 4001, "California");
        DomesticDivision domDiv2 = new DomesticDivision("Midwest Operations", 4002, "Illinois");

        // Display information for each division
        System.out.println("===============================================");
        System.out.println("               COMPANY DIVISIONS               ");
        System.out.println("===============================================");
        System.out.println();

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();

        System.out.println("===============================================");
        System.out.println("       END OF COMPANY DIVISION REPORT         ");
        System.out.println("===============================================");
    }
}
