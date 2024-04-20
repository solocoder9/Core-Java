public class Test2 {
    
    // Method to print "Hello"
    public static void doMoreStuff() {
        System.out.println("Hello");
    }

    // Method calling doMoreStuff() and causing an ArithmeticException
    public static void doStuff() {
        // Calls the doMoreStuff() method to print "Hello"
        doMoreStuff();
        // This operation will result in an ArithmeticException
        System.out.println(100/0);
    }

    // Main method
    public static void main(String[] args) {
        // Calls the doStuff() method
        doStuff();
    }
}

/*
In the above code:
1. The doMoreStuff() method prints "Hello".
2. The doStuff() method calls doMoreStuff() to print "Hello", 
   and then it performs an arithmetic operation (100/0), 
   which will result in an ArithmeticException.
3. Since there's no handling code within doStuff() for the ArithmeticException, 
   the JVM terminates the method and removes it from the stack.
4. Then, the JVM checks the caller method of doStuff(), which is the main() method. 
   There's also no handling code within main() for the ArithmeticException, 
   so the JVM performs the same process as with doStuff().
5. The program terminates abnormally, and the JVM prints information about the ArithmeticException, 
   including the stack trace, before terminating the program.
*/
