@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}

class Adder implements Calculator {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int result = adder.calculate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}

/*
Functional Interface
--------------------
- A functional interface in Java is an interface that contains exactly one abstract method.
- It can have multiple default or static methods, but it must have exactly one abstract method.
- Functional interfaces are used to enable functional programming in Java, particularly with 
  lambda expressions and method references.
- Introduced in Java 8
*/