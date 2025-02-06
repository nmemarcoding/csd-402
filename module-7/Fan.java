// A class that models a fan with speed, on/off, radius, and color properties.

public class Fan {
    // Constants for fan speed settings
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = Fan.STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with parameters
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter methods (using 'this' where allowed)
    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // Setter methods (using 'this' where allowed)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // The toString method is provided but will not be used in UseFans.
    @Override
    public String toString() {
        if (this.on) {
            return "Fan is ON [Speed: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + "]";
        } else {
            return "Fan is OFF [Radius: " + this.radius + ", Color: " + this.color + "]";
        }
    }
}
