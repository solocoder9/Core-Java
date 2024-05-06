import java.lang.ArithmeticException;
import java.lang.NullPointerException;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); // ArithmeticException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } 
    }
}

/* 
Multi-catch block
-----------------
- A multi-catch block in Java allows you to catch multiple types of exceptions in a single catch block. 
- This feature was introduced in Java 7 to simplify exception handling and reduce code duplication. 
- Before Java 7, you had to write separate catch blocks for each exception type, which could lead to 
  code duplication and decreased readability.

Note
----
- One important thing to note is that the exceptions caught in a multi-catch block must be unrelated 
  (i.e., one must not be a subclass of the other). 
- If they are related, the code will not compile. This is to prevent ambiguity in the handling of exceptions.
*/
