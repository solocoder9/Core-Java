import java.io.Serializable;

class MyClass implements Serializable {
    // Class definition
}

public class Main {
    public static void main(String[] args) {
        // Example usage of the Serializable marker interface
        MyClass obj = new MyClass();
        // obj can be serialized because it implements Serializable
    }
}

/*
Marker Interface
-----------------
- Marker interfaces in Java are interfaces that do not declare any methods.
- They serve as markers to indicate certain behaviors or properties of classes that implement them.
- Marker interfaces are typically used to provide metadata about the implementing classes.

Example of a marker interface usage in Java:
- Serializable is a marker interface in Java.
- Classes that implement Serializable can be serialized, meaning their objects can be converted into a stream of bytes for storage or transmission.
- This is typically used in input/output operations in Java.
*/
