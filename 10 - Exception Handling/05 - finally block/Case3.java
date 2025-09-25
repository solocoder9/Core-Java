public class Case3 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(100/0); // AE
        } catch(NullPointerException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
/* 
Output:-
try
finally
Exception in thread "main" java.lang.ArithmeticException: / by zero     
        at Case3.main(Case3.java:5)
        
If there is an exception raised, and it is not handled by a catch block that
matches the exception type, the finally block will be executed.
*/
