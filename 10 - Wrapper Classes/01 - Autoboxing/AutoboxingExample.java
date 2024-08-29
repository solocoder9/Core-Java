public class AutoboxingExample {
	public static void main(String[] args) {
		int i = 9; 
		Integer I = i; // Internally - Integer I = Integer.valueOf(10)
		System.out.println(I);
	}
}
