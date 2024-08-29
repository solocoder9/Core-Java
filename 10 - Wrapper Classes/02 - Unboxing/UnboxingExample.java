public class UnboxingExample {
	public static void main(String[] args) {
		Integer I = 9;
		int i = I; // Internally - int i = I.intValue();
		System.out.println(i);
	}
}
