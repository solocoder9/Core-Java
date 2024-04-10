public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        // Addition
        int sum = a + b; // 10 + 4 = 14

        // Subtraction
        int difference = a - b; // 10 - 4 = 6

        // Multiplication
        int product = a * b; // 10 * 4 = 40

        // Division
        int quotient = a / b; // 10 / 4 = 2 (integer division, truncates the decimal part)

        // Modulus (Remainder)
        int remainder = a % b; // 10 % 4 = 2 (remainder of 10 divided by 4)

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}

/*
- Arithmetic operators are used to perform mathematical operations like addition, subtraction, multiplication, division, and modulus.
- Addition (+): Adds two operands.
- Subtraction (-): Subtracts the second operand from the first.
- Multiplication (*): Multiplies two operands.
- Division (/): Divides the first operand by the second. The result is an integer if both operands are integers.
- Modulus (%): Returns the remainder of the division of the first operand by the second.
- Arithmetic operators follow the standard mathematical rules of precedence.
*/
