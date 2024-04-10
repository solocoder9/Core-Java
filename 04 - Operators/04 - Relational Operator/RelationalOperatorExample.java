public class RelationalOperatorExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Equal to (==)
        boolean isEqual = (a == b); // false

        // Not Equal to (!=)
        boolean isNotEqual = (a != b); // true

        // Greater than (>)
        boolean isGreater = (a > b); // true

        // Less than (<)
        boolean isLess = (a < b); // false

        // Greater than or equal to (>=)
        boolean isGreaterOrEqual = (a >= b); // true

        // Less than or equal to (<=)
        boolean isLessOrEqual = (a <= b); // false

        System.out.println("Equal to: " + isEqual);
        System.out.println("Not Equal to: " + isNotEqual);
        System.out.println("Greater than: " + isGreater);
        System.out.println("Less than: " + isLess);
        System.out.println("Greater than or equal to: " + isGreaterOrEqual);
        System.out.println("Less than or equal to: " + isLessOrEqual);
    }
}

/*
- Relational operators are used to compare two values and return a boolean result (true or false).
- Equal to (==): Checks if two values are equal.
- Not Equal to (!=): Checks if two values are not equal.
- Greater than (>): Checks if the left operand is greater than the right operand.
- Less than (<): Checks if the left operand is less than the right operand.
- Greater than or equal to (>=): Checks if the left operand is greater than or equal to the right operand.
- Less than or equal to (<=): Checks if the left operand is less than or equal to the right operand.
- Relational operators are commonly used in conditional statements and loops to control the flow of a program.
*/
