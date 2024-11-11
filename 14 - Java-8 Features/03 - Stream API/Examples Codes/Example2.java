import java.util.Arrays;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the sum of the squares of even numbers
        int sum = numbers.stream()                // Create a Stream from the list
                         .filter(n -> n % 2 == 0)   // Filter only even numbers
                         .map(n -> n * n)           // Square each number
                         .reduce(0, Integer::sum);  // Sum all the squared numbers

        // Print the result
        System.out.println("Sum of the squares of even numbers: " + sum);
    }
}
