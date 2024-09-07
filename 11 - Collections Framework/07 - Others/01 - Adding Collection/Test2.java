import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(9);
		al1.add(15);
		System.out.println("al1 data: " + al1);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(99);
		al2.add(1999);
		System.out.println("al2 data: " + al2);

		// Adding al1 and al2 data into the al3
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.addAll(al1);
		al3.addAll(al2);
		System.out.println("al3 data: " + al3);

	}
}
