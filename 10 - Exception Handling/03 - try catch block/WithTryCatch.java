public class WithTryCatch {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println(100/0); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Denominator must be non-zero");
        }
        System.out.println("End");
    }
}


// Normal Termination