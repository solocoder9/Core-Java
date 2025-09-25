public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(100/0); //AE
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

/*
printStackTrace() prints information to the console window, including:
- Exception Type: The class name of the exception that occurred.
- Description: An optional message associated with the exception.
- Stack Trace: The sequence of method calls leading up to the exception, showing file names, line numbers, and method names.
 */
