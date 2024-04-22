public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); //AE
        } catch(ArithmeticException e) {
            // Using e.getMessage() to print the exception message
            System.out.println(e.getMessage());
        }
    }
}

/*
When using e.getMessage() to print the exception message:
- Exception Message: The message associated with the exception, if available.
- Example Output: / by zero
  - This is the message associated with the ArithmeticException (/ by zero).
*/
