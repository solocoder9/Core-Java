public class NestedIfExample {
    public static void main(String[] args) {
        int x = 30;
        int y = 10;

        // Outer if statement
        if (x > 20) {
            System.out.println("x is greater than 20");

            // Inner if statement
            if (y > 5) {
                System.out.println("y is greater than 5");
            }
        }
    }
}

/*
- Nested if statements are if statements inside other if statements.
- They allow you to check for multiple conditions and execute different code based on those conditions.
- In this example, the outer if statement checks if x is greater than 20.
- If this condition is true, the inner if statement checks if y is greater than 5.
- If both conditions are true, the corresponding messages are printed.
*/
