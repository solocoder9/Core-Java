public class BreakExample {
    public static void main(String[] args) {
        // Using a for loop to iterate from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Check if i is equal to 5
            if (i == 5) {
                break; // Exit the loop when i is equal to 5
            }
            System.out.println("i: " + i); // Print the current value of i
        }
        System.out.println("Loop ended"); // Print a message after the loop ends
    }
}

/*
- The break statement is used to exit the loop prematurely when a certain condition is met.
- In this example, the for loop iterates from 1 to 10. When i becomes equal to 5, the break statement is executed, and the loop is exited.
- As a result, only the numbers 1 to 4 are printed, and the message "Loop ended" is printed after the loop terminates.
*/
