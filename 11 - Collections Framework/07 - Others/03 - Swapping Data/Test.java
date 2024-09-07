import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Dhoni");
		al1.add("Virat");
		al1.add("Rohit");
		System.out.println("Before swapping: " + al1);

		// Swap data
		Collections.swap(al1, 1, 2);
		System.out.println("After swapping: " + al1);

		// Sublist
		ArrayList<String> al2 = new ArrayList<String>(al1.subList(0, 2)); // 0 include and 2 exclude
		al2.add("McCullum");
		System.out.println("Sublist: " + al2);
	}
}
