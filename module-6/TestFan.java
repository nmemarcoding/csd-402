public class TestFan {
    public static void main(String[] args) {
        // Creating instances of the Fan class
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(Fan.MEDIUM, true, 10, "blue");

        // Displaying the state of both fans with better formatting
        System.out.println("=== Fan Status ===");
        System.out.println("Default Fan:");
        System.out.println("--------------");
        System.out.println(defaultFan);
        System.out.println();
        
        System.out.println("Custom Fan:");
        System.out.println("-----------");
        System.out.println(customFan);
        System.out.println();

        // Testing setter methods
        defaultFan.setSpeed(Fan.SLOW);
        defaultFan.setOn(true);
        defaultFan.setRadius(8);
        defaultFan.setColor("red");

        // Displaying the updated state of the default fan
        System.out.println("Updated Default Fan:");
        System.out.println("-------------------");
        System.out.println(defaultFan);
    }
}
