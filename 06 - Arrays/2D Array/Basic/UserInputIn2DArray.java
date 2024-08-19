import java.util.Scanner;

public class UserInputIn2DArray {

	// Method to print elements of a 2D array
	public static void printArr(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows for the array: ");
		int numOfRow = sc.nextInt();

		System.out.print("Enter the number of columns for the array: ");
		int numOfColumn = sc.nextInt();

		int[][] arr = new int[numOfRow][numOfColumn];

		// For user input array elements
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Print the array elements
		System.out.println("The array elements are: ");
		printArr(arr);

		sc.close();
	}
}
