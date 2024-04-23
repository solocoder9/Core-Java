public class TryWithMultipleCatch3 {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); // AE
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

/*
(Normal Termination)

In 'try' with multiple 'catch' blocks, the order of catch blocks should be
from the subclass to the superclass, not from the superclass to the subclass.
This ensures that more specific exceptions are caught before more general ones.
*/
