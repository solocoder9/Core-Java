import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Example usage of the Function SAM interface
        Function<Integer, String> intToString = (Integer i) -> Integer.toString(i);
        String result = intToString.apply(42);
        System.out.println("Result of conversion: " + result);
    }
}

/*
Single Abstract Method(SAM) Interface
-------------------------------------
- Single Abstract Method(SAM) interfaces in Java are interfaces that contain exactly one abstract method.
- They are also known as functional interfaces and are crucial for enabling functional programming features 
  like lambda expressions and method references.
- Example: java.util.function.Function is a SAM interface in Java.
- It represents a function that accepts one argument and produces a result.


Example of a SAM (Single Abstract Method) interface usage in Java:
- Function is a SAM interface in Java.
- It represents a function that accepts one argument and produces a result.
- The lambda expression (Integer i) -> Integer.toString(i) represents the implementation of the Function's abstract method apply.
- This lambda expression converts an Integer to a String.
*/
