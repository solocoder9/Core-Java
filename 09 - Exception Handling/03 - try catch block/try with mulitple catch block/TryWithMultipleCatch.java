public class TryWithMultipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); // AE
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (ArithmeticException e) {
            // This catch block is unreachable because ArithmeticException is a subclass of Exception.
            System.out.println("Arithmetic exception");
        }
    }
}

/*
(Unreachable catch block for ArithmeticException.)

This is because ArithmeticException is a subclass of Exception, 
so the catch block for Exception already handles it, making the subsequent catch block unreachable.
*/
