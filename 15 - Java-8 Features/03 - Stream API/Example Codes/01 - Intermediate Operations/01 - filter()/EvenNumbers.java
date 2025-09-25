import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(4, 7, 8, 9, 15, 60, 57, 90);

        // Use the stream API to filter out even numbers from the list
        // 'i -> i % 2 == 0' is a lambda expression that checks if the number is even
        List<Integer> evenNumbers = numbers.stream()  // Convert the list into a stream
                                           .filter(i -> i % 2 == 0)  // Keep only even numbers
                                           .toList();  // Collect the results into a new list

        // Iterate through the filtered list and print each even number
        for (Integer i : evenNumbers) {
            System.out.print(i + " ");
        }
    }
}
