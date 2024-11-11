import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50 };

		int sum = Arrays.stream(arr).sum();

		System.out.println(sum);
	}
}
