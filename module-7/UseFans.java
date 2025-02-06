// Name: Nima Memarzadeh
// Date: 02/06/2025
// Assignment: Module 7 Programming Assignment

// This program creates a collection of Fan instances
//  and displays their details.

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UseFans {

    
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        // Check the status of the fan and display speed if it is on.
        if (fan.isOn()) {
            System.out.println("  Status: ON");
            System.out.println("  Speed: " + fan.getSpeed());
        } else {
            System.out.println("  Status: OFF");
        }
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
        System.out.println("---------------------------------");
    }

  
    public static void displayFans(Collection<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {
        // Create a collection of Fan instances using an ArrayList.
        List<Fan> fans = new ArrayList<>();

        // Create several Fan instances.
        Fan fan1 = new Fan();  // Default fan (OFF, speed STOPPED, radius 6, color white)
        Fan fan2 = new Fan(Fan.FAST, true, 12.0, "green");
        Fan fan3 = new Fan(Fan.MEDIUM, false, 8.0, "yellow");
        Fan fan4 = new Fan(Fan.SLOW, true, 10.0, "red");

        // Add the fans to the collection.
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        // Display details for all fans in the collection.
        System.out.println("Displaying details of all fans in the collection:");
        displayFans(fans);

        // Additionally, display details for a single fan (fan2) as a test.
        System.out.println("Displaying details for a single fan (fan2):");
        displayFan(fan2);
    }
}
