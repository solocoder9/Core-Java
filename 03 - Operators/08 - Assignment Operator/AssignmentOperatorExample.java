public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int x = 5; // Simple assignment: x is assigned the value 5

        // Compound assignment operators modify the value of the variable based on an operation and then assign the result back to the variable
        x += 3; // Equivalent to: x = x + 3 (x is now 8)
        x -= 2; // Equivalent to: x = x - 2 (x is now 6)
        x *= 4; // Equivalent to: x = x * 4 (x is now 24)
        x /= 3; // Equivalent to: x = x / 3 (x is now 8)
        x %= 5; // Equivalent to: x = x % 5 (x is now 3)

        System.out.println("Result: " + x);
    }
}

/*
- The assignment operator (=) is used to assign a value to a variable.
- Compound assignment operators (like +=, -=, *=, /=, %=) combine an arithmetic operation with an assignment.
- Compound assignment operators are a shorthand way of performing an operation and assignment in one step.
- Compound assignment operators can be used with all primitive data types.
*/
