public class IfElseIfStatementExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // If-else-if ladder
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is equal to y");
        }
    }
}

/*
- An if-else-if statement allows you to test multiple conditions and execute different blocks of code based on them.
- The conditions are tested in order, and the first condition that evaluates to true executes its block of code.
- If none of the conditions are true, the else block is executed (if present).
- In this example, the if-else-if statement checks if the value of x is greater than, less than, or equal to the value of y.
- Depending on the comparison result, it prints the corresponding message to the console.
*/
