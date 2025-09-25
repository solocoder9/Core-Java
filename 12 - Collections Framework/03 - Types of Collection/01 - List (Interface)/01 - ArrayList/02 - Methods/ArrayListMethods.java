import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {

		// Creating an ArrayList
		ArrayList list = new ArrayList();

		// Adding elements
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		System.out.println("After adding elements: " + list);

		// Adding element at a specific position
		list.add(1, "Mango");
		System.out.println("After adding element at index 1: " + list);

		// Accessing element at a specific index
		System.out.println("Element at index 2: " + list.get(2));

		// Modifying elements
		list.set(1, "Gwava");
		System.out.println("After modifying element at index 1: " + list);

		// Removing element by index
		list.remove(1);
		System.out.println("After removing the element at index 1: " + list);

		// Removing element by value
		list.remove("Orange");
		System.out.println("After removing 'Orange': " + list);

		// Finding the index of an element
		int index = list.indexOf("Banana");
		System.out.println("Index of 'Banana': " + index);

		// Checking if the list contains an element
		boolean contains = list.contains("Orange");
		System.out.println("List contains 'Orange': " + contains);

		// Getting the size of the list
		int size = list.size();
		System.out.println("Size of the list: " + size);

		// Iterating over the list
		System.out.println("Iterating over the list: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index " + i + ": " + list.get(i));
		}

		// Clearing the list
		list.clear();
		System.out.println("After clearing the list: ");

		// Adding elements again
		list.add("Grape");
		list.add("Watermelon");
		list.add("Strawberrie");
		System.out.println("After adding elements again: " + list);

		// Sorting the list
		Collections.sort(list);
		System.out.println("After sorting the list: " + list);

		// Converting the list to an array
		Object[] array = list.toArray();
		System.out.println("Array elements:");
		for (Object element : array) {
			System.out.println(element);
		}

	}
}
