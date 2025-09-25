public class PrefixOperatorExample {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x; // Prefix increment operator: increments x first, then assigns to y

        System.out.println("Prefix Increment:");
        System.out.println("x: " + x); // Output: 6
        System.out.println("y: " + y); // Output: 6

        x = 5;
        y = --x; // Prefix decrement operator: decrements x first, then assigns to y

        System.out.println("\nPrefix Decrement:");
        System.out.println("x: " + x); // Output: 4
        System.out.println("y: " + y); // Output: 4
    }
}

/*
- Prefix increment operator (++x): Increments the value of x and then uses the new value in the expression.
- Prefix decrement operator (--x): Decrements the value of x and then uses the new value in the expression.
- Prefix operators are evaluated before the value is used in the expression.
- Prefix operators are useful when you want to increment or decrement a variable and use the new value immediately.
*/
