public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); //AE
        } catch(ArithmeticException e) {
            // Using e.toString() to print exception type and description
            System.out.println(e.toString());
        }
    }
}

/*
When using e.toString() to print exception type and description:
- Exception Type: The class name of the exception that occurred.
- Description: An optional message associated with the exception.
- Example Output: java.lang.ArithmeticException: / by zero
  - This includes the class name (ArithmeticException) and an optional description (/ by zero).
*/
