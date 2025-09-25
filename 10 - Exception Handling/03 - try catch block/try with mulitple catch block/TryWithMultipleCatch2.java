public class TryWithMultipleCatch2 {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); // AE
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (ArithmeticException e) {
            // We cannot have two catch blocks for the same exception.
            System.out.println("Arithmetic exception");
        }
    }
}

/*
(Compilation Error: Duplicate catch block for ArithmeticException)

We cannot use two catch blocks for the same exception.
Each exception type should be handled only once within a try-catch block.
*/
