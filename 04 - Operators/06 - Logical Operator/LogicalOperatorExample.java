public class LogicalOperatorExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        boolean resultAnd = a && b; // false

        // Logical OR (||)
        boolean resultOr = a || b; // true

        // Logical NOT (!)
        boolean resultNotA = !a; // false
        boolean resultNotB = !b; // true

        System.out.println("Logical AND: " + resultAnd);
        System.out.println("Logical OR: " + resultOr);
        System.out.println("Logical NOT A: " + resultNotA);
        System.out.println("Logical NOT B: " + resultNotB);
    }
}

/*
- Logical AND (&&): Returns true if both operands are true, otherwise returns false.
- Logical OR (||): Returns true if at least one of the operands is true, otherwise returns false.
- Logical NOT (!): Reverses the logical state of its operand. If the operand is true, it returns false, and vice versa.
- Logical operators are used to make decisions in control flow statements and to combine multiple conditions.
*/
