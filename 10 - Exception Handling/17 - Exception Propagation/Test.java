public class Test {
    
    // Method to perform some operation leading to an ArithmeticException
    public static void doMoreStuff() {
        // This operation will result in an ArithmeticException
        System.out.print(100/0);
    }

    // Method calling doMoreStuff()
    public static void doStuff() {
        // Calls the doMoreStuff() method
        doMoreStuff();
    }

    // Main method
    public static void main(String[] args) {
        // Calls the doStuff() method
        doStuff();
    }
}

/**
 * Exception Propagation Example:
 * 
 * This program demonstrates exception propagation in Java. The main method
 * calls the doStuff() method, which in turn calls the doMoreStuff() method.
 * In the doMoreStuff() method, an arithmetic operation that leads to an
 * ArithmeticException is performed. Since the ArithmeticException is not
 * handled in the doMoreStuff() method, it is propagated to the calling
 * method, doStuff(). Since doStuff() also does not handle the exception, it
 * is further propagated to the main method. Finally, the exception is not
 * handled in the main method, leading to the termination of the program.
 */