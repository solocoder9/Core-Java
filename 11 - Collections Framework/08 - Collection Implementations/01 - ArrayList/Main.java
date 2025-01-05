package ArrayList;

//Main class to test the MyArrayList implementation
public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // Create a new MyArrayList

		// Adding elements to the list
		list.add("Hello");
		list.add("World");
		list.add(42);
		list.add(3.14);

		// Print the list size
		System.out.println("Size of list: " + list.size());

		// Get an element from the list
		System.out.println("Element at index 1: " + list.get(1)); // Output: World

		// Check if the list contains an element
		System.out.println("List contains 'World': " + list.contains("World")); // Output: true
		System.out.println("List contains 'Java': " + list.contains("Java")); // Output: false

		// Remove an element at a specific index
		list.remove(2); // Removes element at index 2 (42)
		System.out.println("Size after removal: " + list.size());

		// Print the list size after removal
		System.out.println("Size of list after removal: " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// Clear the list
		list.clear();
		System.out.println("Size after clearing: " + list.size()); // Output: 0
	}
}
