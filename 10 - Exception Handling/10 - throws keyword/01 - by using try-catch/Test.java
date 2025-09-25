public class Test {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000); // This line might throw an InterruptedException
        } catch (InterruptedException e) {
            // Handle the InterruptedException (currently empty in the example)
        }
    }
}

/* 
In our program, the Thread.sleep(1000) method call might throw an InterruptedException, 
which is a checked exception. We are handling this exception by catching it using a try-catch block.
*/
