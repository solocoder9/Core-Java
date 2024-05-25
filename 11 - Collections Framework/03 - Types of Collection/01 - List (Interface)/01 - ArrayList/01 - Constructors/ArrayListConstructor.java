import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListConstructor {
	public static void main(String[] args) {

		// Using the default constructor
		ArrayList list1 = new ArrayList();
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Banana");
		System.out.println("list1: " + list1);

		// Using the constructor with initial capacity
		ArrayList list2 = new ArrayList(10);
		list2.add("Apple");
		list2.add("Orange");
		list2.add("Banana");
		System.out.println("List2: " + list2);

		// Using the constructor with a collection
		ArrayList list3 = new ArrayList(Arrays.asList("Apple", "Orange", "Banana"));
		System.out.println("List3: " + list3);

	}
}
