package ArrayListGeneric;

public class Main {
    public static void main(String[] args) {

        // Creating a new generic ArrayList for String type
        ArrayList<String> list = new ArrayList<>();

        // Adding string elements to the list
        list.add("Spring");
        list.add("Java");
        list.add("Hibernate");
        list.add("JPA");

        // Print the list size
        System.out.println("Size of list: " + list.size());

        // Get an element from the list
        System.out.println("Element at index 1: " + list.get(1)); // Output: Java

        // Check if the list contains an element
        System.out.println("List contains 'Java': " + list.contains("Java")); // Output: true
        System.out.println("List contains 'GPT': " + list.contains("GPT"));   // Output: false

        // Remove an element at a specific index
        list.remove(2); // Removes "Hibernate"
        System.out.println("Size after removal: " + list.size());

        // Print all elements in the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Clear the list
        list.clear();
        System.out.println("Size after clearing: " + list.size()); // Output: 0
    }
}
