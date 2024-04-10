public class ShiftOperatorExample {
    public static void main(String[] args) {
        int number = 8; // Binary representation: 0000 1000

        // Left Shift Operator (<<)
        int resultLeft = number << 2; // Shifts 2 bits to the left: 0010 0000 (32 in decimal)

        // Right Shift Operator (>>)
        int resultRight = number >> 2; // Shifts 2 bits to the right: 0000 0010 (2 in decimal)

        // Unsigned Right Shift Operator (>>>)
        int numberNegative = -8; // Binary representation: 1111 1000
        int resultUnsignedRight = numberNegative >>> 2; // Shifts 2 bits to the right: 0011 1110 (62 in decimal)

        System.out.println("Left Shift Result: " + resultLeft);
        System.out.println("Right Shift Result: " + resultRight);
        System.out.println("Unsigned Right Shift Result: " + resultUnsignedRight);
    }
}

/*
- Shift operators are used to shift the bits of a number left or right.
- Left Shift Operator (<<): Shifts the bits of a number to the left by a specified number of positions.
  This operation is equivalent to multiplying the number by 2^n, where n is the number of positions shifted.
- Right Shift Operator (>>): Shifts the bits of a number to the right by a specified number of positions.
  This operation is equivalent to dividing the number by 2^n, where n is the number of positions shifted.
- Unsigned Right Shift Operator (>>>): Shifts the bits of a number to the right by a specified number of positions.
  Unlike the right shift operator (>>), the unsigned right shift operator fills the leftmost positions with zeros,
  regardless of the sign of the number.
*/
