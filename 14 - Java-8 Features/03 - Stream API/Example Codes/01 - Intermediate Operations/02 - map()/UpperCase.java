package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UpperCase {
    public static void main(String[] args) {

        // Initialize a list of names
        List<String> names = Arrays.asList("Justin", "Charlie", "Alex", "Alice");

        // Convert each name in the list to uppercase using map and String::toUpperCase method reference
        Stream<String> upperCaseNames = names.stream()
        		                          // .map(s -> s.toUpperCase);
                                             .map(String::toUpperCase);  // Apply toUpperCase to each string

        // Print each uppercase name to the console
        upperCaseNames.forEach(System.out::println);  // Print each name in the stream

    }
}
