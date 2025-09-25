import java.util.*;
import java.util.stream.*;

public class Example3 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eva");

        // Example of filter, map, and collect
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());

        System.out.println(filteredNames);  // Output: [ALICE]
    }
}
