public class Case2 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(100/0); // AE
        } catch(ArithmeticException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
/* 
Output:-
try
catch
finally

If there is an exception raised, the finally block will be executed,
even if the exception is handled.
*/
