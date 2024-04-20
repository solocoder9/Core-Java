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

/*
In the above code:
1. An exception occurs at doMoreStuff(), leading to an ArithmeticException.
2. Since there's no handling code within doMoreStuff(), the JVM terminates the method and removes it from the stack.
3. Then, the JVM checks the caller method of doMoreStuff(), which is doStuff(). 
   There's also no handling code within doStuff(), so the JVM performs the same process as with doMoreStuff().
4. Next, the JVM checks the caller method of doStuff(), which is the main() method. 
   Again, there's no handling code within main(), so the JVM terminates the method and removes it from the stack.
5. In such cases, the JVM utilize a Default Exception Handler.
   The Default Exception Handler receives the Exception object, prints information about the exception, 
   including the exception type, message, and stack trace, and then terminates the program abnormally.
*/
