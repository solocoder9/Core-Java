abstract class Vehicle {
    
    // Abstract method to get the number of wheels
    abstract int getNoOfWheels();

    // Non-abstract method
    public void disp() {
        System.out.println("Moter Vehicle");
    }
}

// Subclass Bus implementing abstract method
class Bus extends Vehicle {
    public int getNoOfWheels() {
        return 6;
    }
}

// Subclass Auto implementing abstract method
class Auto extends Vehicle {
    public int getNoOfWheels() {
        return 3;
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating instances of Bus and Auto
        Bus b1 = new Bus();
        Auto a1 = new Auto();

        // Calling getNoOfWheels method
        System.out.println("Number of wheels in Bus: " + b1.getNoOfWheels());
        System.out.println("Number of wheels in Auto: " + a1.getNoOfWheels());
    }
}

/**
 * This code demonstrates abstraction using an abstract class in Java.
 * 
 * The abstract class `Vehicle` defines an abstract method `getNoOfWheels()`
 * that must be implemented by its subclasses. This allows different types of
 * vehicles to provide their own implementation for determining the number
 * of wheels, while adhering to a common interface.
 */
