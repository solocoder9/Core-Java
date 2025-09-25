@FunctionalInterface
interface Calculator {
    // Abstract method for adding two integers
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression to define the 'add' method behavior
        Calculator calculator = (a, b) -> a + b;

        // Using the 'add' method via lambda expression
        int result = calculator.add(5, 10);

        System.out.println("The result of addition is: " + result);  // Output: 15
    }
}
