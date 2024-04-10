public class ContinueExample {
    public static void main(String[] args) {
        // Using a for loop to iterate from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Check if i is equal to 3
            if (i == 3) {
                continue; // Skip the rest of the loop body for i = 3
            }
            System.out.println("i: " + i); // Print the current value of i
        }
    }
}

/*
- The continue statement is used to skip the rest of the loop body for the current iteration and continue with the next iteration.
- In this example, when i is equal to 3, the continue statement is executed, causing the loop to skip the println statement for that iteration.
- As a result, the number 3 is not printed, and the loop continues with the next iteration, printing the numbers 1, 2, 4, and 5.
*/
