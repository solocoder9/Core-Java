public class BitwiseOperatorExample {
    public static void main(String[] args) {
        int a = 5; // Binary representation: 0000 0101
        int b = 3; // Binary representation: 0000 0011

        // Bitwise AND (&)
        int resultAnd = a & b; // Result: 0000 0001 (1 in decimal)

        // Bitwise OR (|)
        int resultOr = a | b; // Result: 0000 0111 (7 in decimal)

        // Bitwise XOR (^)
        int resultXor = a ^ b; // Result: 0000 0110 (6 in decimal)

        // Bitwise Complement (~)
        int resultComplementA = ~a; // Result: 1111 1010 (-6 in decimal)
        int resultComplementB = ~b; // Result: 1111 1100 (-4 in decimal)

        System.out.println("Bitwise AND: " + resultAnd);
        System.out.println("Bitwise OR: " + resultOr);
        System.out.println("Bitwise XOR: " + resultXor);
        System.out.println("Bitwise Complement A: " + resultComplementA);
        System.out.println("Bitwise Complement B: " + resultComplementB);
    }
}

/*
- Bitwise AND (&): Performs a bitwise AND operation on each pair of bits. The result is 1 if both bits are 1.
- Bitwise OR (|): Performs a bitwise OR operation on each pair of bits. The result is 1 if at least one of the bits is 1.
- Bitwise XOR (^): Performs a bitwise XOR (exclusive OR) operation on each pair of bits. The result is 1 if the bits are different.
- Bitwise Complement (~): Flips the bits of the operand, resulting in the one's complement of the number.
- Bitwise operators are used to perform operations on individual bits of integers.
*/
