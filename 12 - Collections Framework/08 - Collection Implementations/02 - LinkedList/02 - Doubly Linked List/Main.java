package linkedlist;

public class Main {
    public static void main(String[] args) throws Exception {

        // Creating a new linkedList
        LinkedList list = new LinkedList();

        // Adding elements to the list
        System.out.println("Adding elements to the LinkedList:");
        list.addFirst("Hello");
        list.addFirst("World");
        list.addLast("Java");
        list.addLast("Programming");

        // Display the list
        System.out.println("Current LinkedList:");
        list.display();  // Output: World -> Hello -> Java -> Programming ->

        // Add element at a specific index
        System.out.println("\nAdding element at index 2 (Middle):");
        list.addAt("Data Structures", 2);
        list.display();  // Output: World -> Hello -> Data Structures -> Java -> Programming ->

        // Get first, last, and specific element
        System.out.println("\nFirst Element: " + list.getFirst()); // World
        System.out.println("Last Element: " + list.getLast()); // Programming
        System.out.println("Element at index 3: " + list.getAt(3)); // Java

        // Remove elements
        System.out.println("\nRemoving first element: " + list.removeFirst());  // Output: World
        System.out.println("Removing last element: " + list.removeLast());    // Output: Programming
        list.display();  // Output: Hello -> Data Structures -> Java ->
        System.out.println("\nRemoving element at index 1: " + list.removeAt(1));

        list.display();  // Output: Hello -> Java ->
    }
}
