public class PostfixOperatorExample {
    public static void main(String[] args) {
        int x = 5;
        int y = x++; // Postfix increment operator: assigns x to y first, then increments x

        System.out.println("Postfix Increment:");
        System.out.println("x: " + x); // Output: 6
        System.out.println("y: " + y); // Output: 5

        x = 5;
        y = x--; // Postfix decrement operator: assigns x to y first, then decrements x

        System.out.println("\nPostfix Decrement:");
        System.out.println("x: " + x); // Output: 4
        System.out.println("y: " + y); // Output: 5
    }
}

/*
- Postfix increment operator (x++): Uses the current value of x in the expression and then increments x.
- Postfix decrement operator (x--): Uses the current value of x in the expression and then decrements x.
- Postfix operators are evaluated after the value is used in the expression.
- When used in an expression, postfix operators can lead to unexpected results in complex expressions
  due to their evaluation order.
*/
