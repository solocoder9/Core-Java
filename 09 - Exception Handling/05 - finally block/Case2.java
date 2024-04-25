public class Case2 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(100/0); // AE
        } catch(ArithmeticException e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }
}
/* 
If there is an exception raised, and it is handled, the finally block
will be executed.
*/
