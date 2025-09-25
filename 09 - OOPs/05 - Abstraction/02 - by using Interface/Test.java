interface Vehicle {
    
    // abstract method (implicitly - no need to declare absract)
    int getNoOfWheels();
}

// Classes implementing the Vehicle interface
class Bus implements Vehicle {
    public int getNoOfWheels() {
        return 6;
    }
}

class Auto implements Vehicle {
    public int getNoOfWheels() {
        return 4;
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
 * This code demonstrates abstraction using an interface in Java.
 * 
 * The `Vehicle` interface defines a method `getNoOfWheels()` that must be
 * implemented by classes that implement the interface. This allows different
 * types of vehicles to provide their own implementation for determining
 * the number of wheels, while adhering to a common interface.
 */
