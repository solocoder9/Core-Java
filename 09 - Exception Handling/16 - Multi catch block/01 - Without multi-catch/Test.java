import java.lang.ArithmeticException;
import java.lang.NullPointerException;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); // ArithmeticException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}

/* 
Disadvantages:-
- Code duplication
- Decreased readability
*/
